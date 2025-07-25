package com.example;

import com.example.config.AppConfig;
import com.example.dao.AspectDao;
import com.example.dao.ProductDao;
import com.example.dao.ProductDaoImpl;
import com.example.dao.UserDao;
import com.example.model.Car;
import com.example.model.Engine;
import com.example.model.Product;
import com.example.model.User;
import com.example.service.ProductService;
import com.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

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

////        2.2 XML config
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("beans-vehicle.xml");
//        Car car = context.getBean("car", Car.class);
//        car.drive();
//
//        context.close();

////        3. DataSource & JDBC Access
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(AppConfig.class);
//        UserDao userDao = context.getBean(UserDao.class);
////      Thêm user mới
//        userDao.saveUser(new User(0, "Mai Văn Đăng"));
//
////      Lấy danh sách user
//        List<User> users = userDao.getAllUsers();
//        for (User u : users) {
//            System.out.println(u.getId() + " - " + u.getName());
//        }
//
//        context.close();

////        4. Spring ORM + Hibernate / JPA
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        ProductDao productDao = context.getBean("productDao", ProductDao.class);
//        UserDao userDao = context.getBean("userDao",UserDao.class);
//
//        productDao.saveProduct(new Product("Giày thể thao", "Nike"));
//
//        List<Product> products = productDao.getAllProducts();
//        products.forEach(product -> System.out.println(product.getId() + " - " + product.getName() + " - " +product.getSupplier()));
//
//
//        List<User> users = userDao.getAllUsers();
//        for (User u : users) {
//            System.out.println(u.getId() + " - " + u.getName());
//        }

////        5. Transaction Management
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("beans.xml");
//
//        // Test rollback JDBC
//        UserService userService = context.getBean(UserService.class);
//        try {
//            userService.saveTwoUsersWithRollback(new User("Alice"), new User("Bob"));
//        } catch (Exception e) {
//            System.out.println("User rollback OK: " + e.getMessage());
//        }
//
//        // Test rollback Hibernate
//        ProductService productService = context.getBean(ProductService.class);
//        try {
//            productService.saveTwoProductsWithRollback(new Product("TV","Samsung"), new Product("Laptop", "Acer"));
//        } catch (Exception e) {
//            System.out.println("Product rollback OK: " + e.getMessage());
//        }
//        6. AOP
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans-aspect.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        AspectDao aspectDao = context.getBean("aspectDao", AspectDao.class);
        AspectDao aspectDao = context.getBean(AspectDao.class);
        UserDao userDao = context.getBean(UserDao.class);
        List<User> users = userDao.getAllUsers();
        for (User u : users) {
            System.out.println(u.getId() + " - " + u.getName());
        }
//        aspectDao.saveDao();
//        aspectDao.deleteDao();

    }
}
