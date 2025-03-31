package com.vishal.bharti.advice_service_weather_prediction.dto;

import lombok.Data;

@Data
public class WindDetailsDTO {

    private double speed;
    private Integer deg;
    private double gust;

}
