package com.github.elczupakadra.projectName.api;

import com.github.elczupakadra.projectName.model.Pizza;
import com.github.elczupakadra.projectName.model.Składnik;
import org.springframework.web.bind.annotation.*;

@RestController() //ta klasa będzie obsługiwać zapytania sieciowe
@RequestMapping(path = "/pizza")
public class HelloController {
    @PostMapping(path = "/hello")
    public String printHello(){
        return "Hello World! POST";
    }
    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello World! GET";
    }

    @GetMapping(path = "/pizza")
    public Pizza getPizza(){
        return pizza;
    }

    @GetMapping(path = "/składnik")
    public String podajSkładnik(){
        return pizza.getSkładnik().getNazwa();
    }

    @GetMapping(path = "/liczba")
    public int podajLiczbę(){
        return (int)(Math.random()*10)+1;
    }

    private Pizza pizza;

    public HelloController(Pizza pizza) {
        this.pizza = pizza;
    }

}
