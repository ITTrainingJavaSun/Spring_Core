package com.example.springCore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeDemoConfig {
    @Bean
    @Scope("singleton")
    public String singletonBean() {
        return "Đây là bean singleton";
    }

    @Bean
    @Scope("prototype")
    public String prototypeBean() {
        return "Đây là bean prototype";
    }
} 