package com.syaaa.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName DynamicClient
 * @Description TODO
 * @Author APPO
 * @Date 13:13   2018-9-7
 * @Version 1.0
 **/
public class DynamicClient {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        InvocationHandler handler = new DynamicProxySubject(realSubject);
        Class<?> classType = handler.getClass();

        /**
         *  Proxy.newProxyInstance(classType.getClassLoader(), realSubject.getClass().getInterfaces(), handler);
         *  相当于生成一个类，实现所动态代理对象所实现的接口。
         */
        Subject subject =(Subject) Proxy.newProxyInstance(classType.getClassLoader(), realSubject.getClass().getInterfaces(), handler);
        subject.borrowHouse();

    }
}
