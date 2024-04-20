package com.mu.pojo4;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;
    public void setTarget(Object target){
        this.target = target;
    }
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),//指定用于加载代理类的类加载器。
                target.getClass().getInterfaces(),//指定代理类要实现的接口列表。
                this);//ProxyInvocationHandler 对象本身
    }
//利用反射实现动态代理
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(target,args);
        demo1();
        return result;
    }

    public void demo1(){
        System.out.println("方法的具体实现");
    }
}
