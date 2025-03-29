package com.vishal.bharti.cache_service_weather_prediction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    private final OpenWeatherMapApiConfig apiConfig;

    public WebClientConfig(OpenWeatherMapApiConfig apiConfig) {
        this.apiConfig = apiConfig;
    }

    @Bean
    public WebClient webClient(WebClient.Builder builder) {
        return builder
                .baseUrl(apiConfig.getUrl())
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

}
