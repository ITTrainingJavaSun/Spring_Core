package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Car {
//    @Autowired
    private Engine engine;

    // Constructor Injection
//    public Car(Engine engine) {
//        this.engine = engine;
//    }

    //Setter injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is moving...");
    }
}
