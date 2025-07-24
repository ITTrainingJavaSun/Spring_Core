package com.example.springCore.controller;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/scope-demo")
public class ScopeDemoController {
    @Autowired
    @Qualifier("singletonBean")
    private String singletonBean;

    @Autowired
    @Qualifier("prototypeBean")
    private ObjectFactory<String> prototypeBeanFactory;

    @GetMapping("/singleton")
    public String getSingletonBean() {
        return singletonBean + " - hash: " + singletonBean.hashCode();
    }

    @GetMapping("/prototype")
    public String getPrototypeBean() {
        String prototype = prototypeBeanFactory.getObject();
        return prototype + " - hash: " + prototype.hashCode();
    }
} 