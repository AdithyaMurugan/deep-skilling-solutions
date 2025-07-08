package com.library.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.library.service.BookService.*(..))")
    public void beforeAdvice() {
        System.out.println("Logging BEFORE method execution.");
    }

    @After("execution(* com.library.service.BookService.*(..))")
    public void afterAdvice() {
        System.out.println("Logging AFTER method execution.");
    }
}
