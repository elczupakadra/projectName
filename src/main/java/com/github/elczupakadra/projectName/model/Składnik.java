package com.github.elczupakadra.projectName.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

public class Składnik {
@Getter
@Setter
    private String nazwa;
    public Składnik(String nazwa){
        this.nazwa = nazwa;
    }

//    Pizza p = new Pizza();

}
