package com.mu.pojo;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        //代理
        Proxy proxy = new Proxy(host);
        proxy.rent();
        //直接接触代理，不用接触原类
    }
}
