package com.example.dao;

import org.springframework.stereotype.Component;

@Component
public class AspectDao {

    public void saveDao() {
        System.out.println("Saving user...");
    }

    public void deleteDao() {
        System.out.println("Deleting user...");
    }
}
