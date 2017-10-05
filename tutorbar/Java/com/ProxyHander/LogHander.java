package com.ProxyHander;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogHander implements InvocationHandler {

    private LogHander logHander;

    private  Object target;

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        proxy = target;
        //
        System.out.println("excute"+method.getName());
        method.invoke(proxy);
        System.out.println("sussful");
        return null;
        //after
    }

    public LogHander(Object target) {
        this.target = target;
    }

    public  Object getProxy(InvocationHandler handler) {
        Class clazz = target.getClass();
        ClassLoader classLoader = clazz.getClassLoader();
        return Proxy.newProxyInstance(classLoader, clazz.getInterfaces(), handler);
    }
}
