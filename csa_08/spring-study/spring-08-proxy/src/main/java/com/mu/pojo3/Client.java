package com.mu.pojo3;

import com.mu.pojo3.Host;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //提供调用程序处理角色来处理我们要调用的对象
        pih.setRent(host);


        Rent proxy = (Rent) pih.getProxy();//这个proxy是动态生成的
        proxy.rent();
    }
}
