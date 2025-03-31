package com.vishal.bharti.advice_service_weather_prediction.services;


import com.vishal.bharti.advice_service_weather_prediction.dto.WeatherResponseDTO;

import java.util.concurrent.CompletableFuture;

public interface WeatherDataService {

      /**
     * Retrieves weather forecast for a given city.
     *
     * @param city the name of the city
     * @return the weather forecast as a JSON string
     */

     CompletableFuture<WeatherResponseDTO> getForecastData(String city);

     /**
     * Adds weather advice to the forecast data.
     *
     * @param weatherResponseDTO the weather response DTO to which advice will be added
     */
    void addAdviceToForecast(WeatherResponseDTO weatherResponseDTO);

}