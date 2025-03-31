package com.vishal.bharti.advice_service_weather_prediction.dto;

import lombok.Data;

@Data
public class MainDTO {

    private double temp;
    private double feels_like;
    private double temp_min;
    private double temp_max;
    private Integer pressure;
    private Integer humidity;

}
