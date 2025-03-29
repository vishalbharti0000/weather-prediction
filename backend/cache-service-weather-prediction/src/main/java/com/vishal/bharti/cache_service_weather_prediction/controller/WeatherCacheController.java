package com.vishal.bharti.cache_service_weather_prediction.controller;

import com.vishal.bharti.cache_service_weather_prediction.constants.SwaggerSampleResponse;
import com.vishal.bharti.cache_service_weather_prediction.services.WeatherCacheService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@Slf4j
@RestController
@RequestMapping("/cache")
public class WeatherCacheController {
    
    private final WeatherCacheService weatherCacheService;

    public WeatherCacheController(WeatherCacheService weatherCacheService) {
        this.weatherCacheService = weatherCacheService;
    }

    @Operation(
        summary = "Get Weather Data from Cache", 
        description = "Fetch cached weather data for a given city.",
        parameters = {
            @Parameter(
                name = "city",
                description = "Name of the city to fetch cached weather data for",
                required = true,
                example = "London"
            )
        }
    )
    @ApiResponses(value = {
        @ApiResponse(
            responseCode = "200",
            description = "Weather data fetched successfully",
            content = @Content(
                mediaType = "application/json",
                examples = @ExampleObject(
                    value = SwaggerSampleResponse.SUCCESS_WEATHER_EXAMPLE
                )
            )
        ),
        @ApiResponse(
            responseCode = "404",
            description = "City not found or no cached data available",
            content = @Content(
                examples = @ExampleObject(
                    value = SwaggerSampleResponse.CITY_NOT_FOUND
                )
            )
        ),
        @ApiResponse(
            responseCode = "500",
            description = "Internal Server Error",
            content = @Content(
                examples = @ExampleObject(
                    value = SwaggerSampleResponse.INTERNAL_SERVER_ERROR
                )
            )
        )
    })
    @GetMapping("/weather")
    public Mono<ResponseEntity<String>> getWeatherData(@RequestParam String city) {
        log.info("Requested /cache/weather with city: " + city);
        return weatherCacheService.getCachedWeatherData(city.toLowerCase())
                .map(cachedData -> ResponseEntity.ok(cachedData))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
    
}
