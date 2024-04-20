package com.mu.pojo;

import org.springframework.stereotype.Component;
/*
* @Component组件
* 等价于
* <bean id="User" class="com.mu.pojo.User"/>
* 创建的对象名字是类名的小写
* */
@Component
public class User {
    public String name = "卡卡西";
}
