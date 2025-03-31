package com.vishal.bharti.advice_service_weather_prediction.dto;

import lombok.Data;

import java.util.List;

@Data
public class WeatherResponseDTO {

    private CityDTO city;
    private List<ForecastDTO> list;
    private Integer cnt;

}


