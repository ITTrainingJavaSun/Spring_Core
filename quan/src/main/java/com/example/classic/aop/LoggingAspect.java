package com.example.classic.aop;

public class LoggingAspect {
	public void logBeforeExecution() {
		System.out.println("AOP LOG: Một phương thức service sắp được thực thi...");
	}
}
