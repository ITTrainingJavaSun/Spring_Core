package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.dao.*.*(..))")
    public void logBefore(JoinPoint jp) {
        System.out.println("[BEFORE] Gọi đến: " + jp.getSignature().getName());
    }

    @After("execution(* com.example.dao.*.*(..))")
    public void logAfter(JoinPoint jp) {
        System.out.println("[AFTER] Kết thúc: " + jp.getSignature().getName());
    }
}
