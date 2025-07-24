package com.example.springCore.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.example.springCore.service..*(..)) || execution(* com.example.springCore.controller..*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[AOP] Bắt đầu gọi: " + joinPoint.getSignature());
    }

    @AfterReturning(pointcut = "execution(* com.example.springCore.service..*(..)) || execution(* com.example.springCore.controller..*(..))", returning = "result")
    public void logAfter(JoinPoint joinPoint, Object result) {
        System.out.println("[AOP] Kết thúc gọi: " + joinPoint.getSignature() + ", trả về: " + result);
    }
} 