package com.vishal.bharti.cache_service_weather_prediction.exceptions;

public class CacheServiceException extends RuntimeException {
    public CacheServiceException(String message) {
        super(message);
    }

    public CacheServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
