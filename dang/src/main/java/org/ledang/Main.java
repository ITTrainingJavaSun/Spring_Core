package org.ledang;

import org.ledang.config.AppConfig;
import org.ledang.entity.User;
import org.ledang.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var userService = context.getBean(UserService.class);

        User user = new User();
        user.setName("Dang");
        user.setUsername("lequocdang");
        user.setPassword("123456");
        user.setBirthday("2004-08-29");
        userService.saveUser(user);
        System.out.println("User saved");

        userService.deleteById(user.getId());
        User user1 = userService.findByUsername("lequocdang");
        if (user1 == null) {
            System.out.println("User co username lequocdang not found");
        }

        try {
            userService.testRollback();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        User user2 = userService.findByUsername("dangne");
        if (user2 == null) {
            System.out.println("User co username dangne not found");
        }
    }
}