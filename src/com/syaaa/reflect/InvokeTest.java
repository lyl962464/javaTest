package com.syaaa.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName InvokeTest
 * @Description 使用反射获取类中的方法，以及传入相应的参数的方式
 * @Author APPO
 * @Date 19:21   2018-9-4
 * @Version 1.0
 **/
public class InvokeTest {
    public int add(int a,int b){
        return a+b;
    }

    public String echo(String msg){
        return "Hello " + msg;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        获取反射对象

        Class<?> classType = InvokeTest.class;
//        实例化对象

        Object invokeTest = classType.newInstance();

//        获取类中相应的方法
        Method addMethod = classType.getMethod("add", new Class[]{int.class, int.class});

//        给方法传入相应的参数

        Object result = addMethod.invoke(invokeTest, new Object[]{1, 2});

        System.out.println((Integer) result);

        System.out.println("-----------");


        Method echoMethod = classType.getMethod("echo", new Class[]{String.class});
        Object strResult = echoMethod.invoke(invokeTest,new Object[]{"反射"});

        System.out.println(strResult);


    }
}
