package com.vishal.bharti.advice_service_weather_prediction;

import com.vishal.bharti.advice_service_weather_prediction.config.WeatherAPIConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableConfigurationProperties(WeatherAPIConfig.class)
@EnableAsync
public class AdviceServiceWeatherPredictionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdviceServiceWeatherPredictionApplication.class, args);
	}

}
