package com.vishal.bharti.cache_service_weather_prediction.exceptions;

public class CacheMissException extends RuntimeException {
    public CacheMissException(String message) {
        super(message);
    }

    public CacheMissException(String message, Throwable cause) {
        super(message, cause);
    }
}
