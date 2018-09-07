package com.syaaa.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName DynamicProxy
 * @Description TODO
 * @Author APPO
 * @Date 15:51   2018-9-7
 * @Version 1.0
 **/
public class DynamicProxy implements InvocationHandler {


    private Object proxyObjet;

    public DynamicProxy(){

    }
    public DynamicProxy(Object proxyObjet){
        this.proxyObjet = proxyObjet;
    }
    public void setProxyObjet(Object proxyObjet) {
        this.proxyObjet = proxyObjet;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        return method.invoke(proxyObjet,args);
    }
}
