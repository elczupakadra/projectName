package com.github.elczupakadra.projectName.configuration;

import com.github.elczupakadra.projectName.model.Składnik;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {
    @Bean
    Składnik getDefaultSkładnik(){
        return new Składnik("ser");
    }
}
