package com.vishal.bharti.cache_service_weather_prediction.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
        .info(new Info()
                .title("Weather cache service documentation")
                .version("1.0")
                .description("API endpoints to cache weather data and serve it"));
    }

}
