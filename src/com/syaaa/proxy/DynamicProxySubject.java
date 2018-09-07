package com.syaaa.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName DynamicProxySubject
 * @Description TODO
 * @Author APPO
 * @Date 13:10   2018-9-7
 * @Version 1.0
 **/
public class DynamicProxySubject implements InvocationHandler {

    private Object object;

    public DynamicProxySubject(Object obj){
        this.object = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入方法之前的对象"+method);

        method.invoke(object,args);
        System.out.println("进入方法之后的对象"+method);

        return null;
    }
}
