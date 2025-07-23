package com.example;

import com.example.model.Car;
import com.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//        ApplicationContext context0 = new ClassPathXmlApplicationContext("beans.xml");
//        UserService service = context0.getBean("userService", UserService.class);
//        service.registerUser("Mai Van Dang");
//        System.out.println("User saved!");

//        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext context0 = new ClassPathXmlApplicationContext("beans-vehicle.xml");
        Car car = context0.getBean(Car.class);
        car.drive();

    }
}
