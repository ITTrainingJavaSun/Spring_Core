package com.example;

import com.example.model.Car;
import com.example.model.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {

//    @Bean
//    public Engine engine() {
//        return new Engine();
//    }
//
//    @Bean
//    public Car car() {
////        return new Car(engine()); // constructor inject
//        //Setter inject
//        Car car = new Car();
//        car.setEngine(engine());
//        return car;
//    }
}

