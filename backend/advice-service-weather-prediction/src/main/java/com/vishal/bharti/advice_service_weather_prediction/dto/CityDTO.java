package com.vishal.bharti.advice_service_weather_prediction.dto;

import lombok.Data;

@Data
public class CityDTO {

    private String name;
    private String country;
    private Integer sunrise;
    private Integer sunset;

}
