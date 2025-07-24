package com.example.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
public class Engine {

//    @PostConstruct
    public void init() {
        System.out.println("Init method called");
    }

    public Engine() {
        System.out.println("Engine created!");
    }

//    @PreDestroy
    public void destroy() {
        System.out.println("Destroy method called");
    }

    public void start() {
        System.out.println("Engine started");
    }
}

