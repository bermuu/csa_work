package com.mu.config;

import com.mu.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//类似于bean
@Configuration//会被spring托管
public class muconfig {
    @Bean//注册的一个bean,这个方法的名字相当于id属性,返回值相当于class属性
    public User getUser(){
        return new User();
    }

}
