package org.ledang.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* org.ledang.service.UserService.saveUser(..))")
    public void beforeLogger() {
        System.out.println("Before Logger");
    }

    @After("execution(* org.ledang.service.UserService.saveUser(..))")
    public void afterLogger() {
        System.out.println("After Logger");
    }

    @Around("execution(* org.ledang.service.UserService.saveUser(..))")
    public Object aroundLogger(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before Logger (via @Around)");

        Object result = joinPoint.proceed();

        System.out.println("After Logger (via @Around)");

        return result;
    }
}
