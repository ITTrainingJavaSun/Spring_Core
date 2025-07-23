package com.example.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

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

    /// /        return new Car(engine()); // constructor inject
//        //Setter inject
//        Car car = new Car();
//        car.setEngine(engine());
//        return car;
//    }

//    3. DataSource & JDBC Access
    @Bean
    public DataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/testdb");
        ds.setUsername("root");
        ds.setPassword("admin");
        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource ds) {
        return new JdbcTemplate(ds);
    }
}

