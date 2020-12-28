package com.github.elczupakadra.projectName.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.http.HttpClient;

@Configuration
public class HttpClientConfig {
    @Bean
    HttpClient getHTTPClient(){
        return HttpClient.newBuilder().build();
    };
}
