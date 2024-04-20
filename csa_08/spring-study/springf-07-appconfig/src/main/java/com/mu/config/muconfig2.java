package com.mu.config;

import com.mu.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(muconfig.class)
@Configuration
public class muconfig2 {
    @Bean
    public User getUser(){
        return new User();
    }
}
