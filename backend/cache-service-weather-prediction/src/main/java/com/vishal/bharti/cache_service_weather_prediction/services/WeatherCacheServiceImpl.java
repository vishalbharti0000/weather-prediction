package com.vishal.bharti.cache_service_weather_prediction.services;

import com.vishal.bharti.cache_service_weather_prediction.config.OpenWeatherMapApiConfig;
import com.vishal.bharti.cache_service_weather_prediction.exceptions.WeatherDataFetchException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static com.vishal.bharti.cache_service_weather_prediction.constants.Constants.WEATHER_DATA_WITH_COLON;
import static com.vishal.bharti.cache_service_weather_prediction.constants.Constants.WEATHER_DATA_WITH_COLON_AND_STAR;

@Slf4j
@Service
public class WeatherCacheServiceImpl implements WeatherCacheService {

    private final StringRedisTemplate redisTemplate;
    private final WebClient webClient;
    private final OpenWeatherMapApiConfig apiConfig;

    private static final long CACHE_TTL = 24 * (long) 60;
    private static final long MAX_CITIES_TO_CACHE = 50;

    public WeatherCacheServiceImpl(StringRedisTemplate redisTemplate, WebClient webClient, OpenWeatherMapApiConfig apiConfig) {
        this.redisTemplate = redisTemplate;
        this.webClient = webClient;
        this.apiConfig = apiConfig;
    }

    @Override
    @Scheduled(fixedRate = 15 * 60 * 1000)
    @CircuitBreaker(name = "weather-api", fallbackMethod = "fetchWeatherDataFallback")
    public Mono<Void> fetchAndCacheWeatherData() {
        Set<String> topCities = getTopAccessedCities();
        final int MAX_CALLS_PER_MINUTE = 60;
        AtomicInteger apiCallCount = new AtomicInteger(0);

        Set<String> cachedCities = redisTemplate.keys(WEATHER_DATA_WITH_COLON_AND_STAR).stream()
                .map(key -> key.replace(WEATHER_DATA_WITH_COLON, ""))
                .collect(Collectors.toSet());

        Set<String> citiesToInvalidate = new HashSet<>(cachedCities);
        citiesToInvalidate.removeAll(topCities);

        for (String city : citiesToInvalidate) {
            log.info("Invalidating cache for city: " + city);
            redisTemplate.delete(WEATHER_DATA_WITH_COLON + city);
        }

        List<Mono<Void>> cityFetchMonos = new ArrayList<>();

        for (String city : topCities) {
            if (apiCallCount.get() >= MAX_CALLS_PER_MINUTE) {
                log.info("API call limit reached. Pausing for 1 minute...");
                cityFetchMonos.add(Mono.delay(Duration.ofMinutes(1))
                        .then(Mono.fromRunnable(() -> fetchAndCacheCityData(city, apiCallCount))));
                apiCallCount.set(0);
            } else {
                cityFetchMonos.add(Mono.fromRunnable(() -> fetchAndCacheCityData(city, apiCallCount)));
            }
        }

        return Mono.when(cityFetchMonos);
    }

    private void fetchAndCacheCityData(String city, AtomicInteger apiCallCount) {
        fetchAndCacheSingleCityData(city)
                .doOnTerminate(() -> apiCallCount.incrementAndGet())
                .onErrorResume(ex -> {
                    log.error("Error occurred while fetching and caching weather data for city: " + city, ex);
                    return Mono.empty();  
                })
                .subscribe(
                    data -> {
                        log.info("Successfully fetched and cached data for city: " + city);
                        redisTemplate.expire(WEATHER_DATA_WITH_COLON + city, CACHE_TTL, TimeUnit.MINUTES);
                    },
                    error -> log.error("Error occurred during subscribe: ", error) 
                );
    }

    private Set<String> getTopAccessedCities() {
        log.info("Requested top accessed cities from redis");
        return redisTemplate.opsForZSet()
                .reverseRange("cityAccessCount", 0, MAX_CITIES_TO_CACHE - 1);
    }

    public void trackCityAccess(String city) {
        log.info("Updated city tracking for city: " + city);
        redisTemplate.opsForZSet().incrementScore("cityAccessCount", city, 1);
    }

    @Override
    public Mono<String> getCachedWeatherData(String city) {
        log.info("Requested cached data from Redis for city: " + city);
        trackCityAccess(city);

        String cachedData = redisTemplate.opsForValue().get(WEATHER_DATA_WITH_COLON + city);

        if (cachedData == null) {
            log.info("Cache miss for city: " + city + ". Fetching from OpenWeather API...");
            
            return fetchAndCacheSingleCityData(city)
                .onErrorResume(ex -> {
                    log.error("Error while fetching data for city: " + city);
                    return Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND, "City not found"));
                });
        }

        redisTemplate.expire(WEATHER_DATA_WITH_COLON + city, CACHE_TTL, TimeUnit.MINUTES);
        return Mono.just(cachedData);
    }

    Mono<String> fetchAndCacheSingleCityData(String city) {
        String url = String.format("/data/2.5/forecast?q=%s&appid=%s&cnt=32&units=metric", city, apiConfig.getKey());
        log.info(url);
        return webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(String.class)
                .doOnTerminate(() -> trackCityAccess(city))
                .flatMap(weatherData -> {
                    if (weatherData != null && !weatherData.isEmpty()) {
                        log.info("Setting city in redis with TTL: " + city);
                        redisTemplate.opsForValue().set(WEATHER_DATA_WITH_COLON + city, weatherData, CACHE_TTL, TimeUnit.MINUTES);
                        return Mono.just(weatherData);
                    } else {
                        log.error("Received null or empty response for city: " + city);
                        return Mono.error(new WeatherDataFetchException("Received null or empty response for city: " + city));
                    }
                })
                .onErrorMap(WebClientResponseException.NotFound.class, e -> {
                    log.error("OpenWeather API returned 404 Not Found for city: " + city + e.getMessage());
                    return new ResponseStatusException(HttpStatus.NOT_FOUND, "City not found in OpenWeather API", e);
                })
                .onErrorMap(RestClientException.class, e -> new WeatherDataFetchException("Failed to fetch data for city: " + city, e));
    }
    

    public String fetchWeatherDataFallback(String city, Throwable throwable) {
        log.info("Fallback triggered due to: " + throwable.getMessage());
        String cachedData = redisTemplate.opsForValue().get(WEATHER_DATA_WITH_COLON + city);
        if (cachedData != null) {
            return cachedData;
        } else {
            return "No weather data available and unable to fetch from API.";
        }
    }
}
