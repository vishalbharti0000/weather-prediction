package com.vishal.bharti.cache_service_weather_prediction.services;

import reactor.core.publisher.Mono;

public interface WeatherCacheService {
    /**
     * Fetches and caches weather data from the OpenWeather API asynchronously.
     */
    Mono<Void> fetchAndCacheWeatherData();

    /**
     * Retrieves cached weather data for the given city.
     *
     * @param city the name of the city
     * @return the cached weather data as a JSON string wrapped in a Mono, or Mono.empty() if not found
     */
    Mono<String> getCachedWeatherData(String city);
}
