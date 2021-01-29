package com.srg.phoneapp.orders.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@ConstructorBinding
public class OrderConfig {

    @Value("${phoneapp.endpoint.catalog}")
    private String catalogEndpoint;

    @Bean
    public WebClient webClient() {
        return WebClient.create(catalogEndpoint);
    }
}
