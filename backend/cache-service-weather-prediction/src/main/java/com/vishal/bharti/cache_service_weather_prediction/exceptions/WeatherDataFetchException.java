package com.vishal.bharti.cache_service_weather_prediction.exceptions;

public class WeatherDataFetchException extends RuntimeException {
    public WeatherDataFetchException(String message) {
        super(message);
    }

    public WeatherDataFetchException(String message, Throwable cause) {
        super(message, cause);
    }
}
