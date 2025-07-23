package com.example.factory;

import com.example.model.Engine;

public class EngineFactory {
    public static Engine createEngine() {
        System.out.println("Static factory method called");
        return new Engine();
    }

    public Engine buildEngine() {
        System.out.println("Instance factory method called");
        return new Engine();
    }
}
