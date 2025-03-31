package com.vishal.bharti.advice_service_weather_prediction.exceptions;

public class WeatherDataNotFoundException extends RuntimeException {

    public WeatherDataNotFoundException(String message) {
        super(message);
    }

}
