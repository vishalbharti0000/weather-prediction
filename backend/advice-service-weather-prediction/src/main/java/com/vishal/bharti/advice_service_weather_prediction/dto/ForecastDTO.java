package com.vishal.bharti.advice_service_weather_prediction.dto;

import lombok.Data;

import java.util.List;

@Data
public class ForecastDTO {

    private long dt;
    private String dt_text; 
    private MainDTO main;
    private List<WeatherDetailsDTO> weather;
    private WindDetailsDTO wind;
    private Integer visibility;
    private double pop;
    private List<String> advice;

}
