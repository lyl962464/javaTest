package com.syaaa.proxy;

import com.syaaa.util.PrintUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

/**
 * @ClassName VectorDynamicProxy
 * @Description TODO
 * @Author APPO
 * @Date 14:00   2018-9-7
 * @Version 1.0
 **/
public class VectorDynamicProxy implements InvocationHandler {


    private Object proxyObject;

    public VectorDynamicProxy(Object obj){
        this.proxyObject = obj;
    }


    public static  Object  factory(Object object){
        Class<?> classType = object.getClass();
        return Proxy.newProxyInstance(classType.getClassLoader(),classType.getInterfaces(),new VectorDynamicProxy(object));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        System.out.println("调用之前生成的方法"+method);
        if(null != args){
            for (Object arg : args) {
                System.out.println(arg);
            }
        }
        Object methodObject = null;
        try {
            methodObject = method.invoke(proxyObject,args);
        }catch (IllegalAccessException e){
            PrintUtil.printMsgException(e);
        }catch (InvocationTargetException e){
            PrintUtil.printMsgException(e);
        }
        return methodObject;
    }

    public static void main(String[] args) {
        List list = (List) factory(new Vector());
        list.add("张三");
        list.add("李四");





    }
}
