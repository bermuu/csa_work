package com.mu.log;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice{
    @Override
    //method 要执行的目标对象的方法
    //object 参数
    //target 目标对象

    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行了");

    }
}
