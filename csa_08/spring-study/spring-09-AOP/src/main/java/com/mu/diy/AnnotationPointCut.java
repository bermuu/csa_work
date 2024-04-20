package com.mu.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//注解实现AOP
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.mu.pojo.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("==========方法执行前===========");
    }
    @After("execution(* com.mu.pojo.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("==========方法执行后===========");
    }
    //在环绕增强中，可以给点一个参数，获取要切入的点
    @Around("execution(* com.mu.pojo.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("==========环绕方法执行前===========");
        Object proceed = jp.proceed();
        System.out.println("==========环绕方法执行后===========");

    }
}
