package com.example;

import com.example.model.Car;
import com.example.model.Engine;
import com.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//        1.Spring Context
//        ApplicationContext context0 = new ClassPathXmlApplicationContext("beans.xml");
//        UserService service = context0.getBean("userService", UserService.class);
//        service.registerUser("Mai Van Dang");
//        System.out.println("User saved!");

//        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
////        ApplicationContext context0 = new ClassPathXmlApplicationContext("beans-vehicle.xml");
//        Car car = context1.getBean(Car.class);
//        car.drive();

//      2.Bean Scope & Bean Lifecycle
//        2.1 Annatation config
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(AppConfig.class);
////        Engine e1 = context.getBean(Engine.class);
////        Engine e2 = context.getBean(Engine.class);
//        Car car = context.getBean(Car.class);
//        car.drive();

//        System.out.println("e1 == e2 ? " + (e1 == e2));
        // In ra true nếu scope là singleton
        // In ra false nếu scope là prototype

        //Nếu muốn hủy với scope là prototype
//        e1.destroy();
//        e2.destroy();
//        context.close();

//        2.2 XML config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans-vehicle.xml");
        Car car = context.getBean("car", Car.class);
        car.drive();

        context.close();
    }
}
