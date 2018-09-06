package com.syaaa.reflect;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName TestPrivate
 * @Description TODO
 * @Author APPO
 * @Date 19:02   2018-9-6
 * @Version 1.0
 **/
public class TestPrivate {
    public static void main(String[] args) {

        PrivateMethod pm = new PrivateMethod();

        Class<?> classType = pm.getClass();
        Method method = null;

        try {

//            method = classType.getDeclaredMethod("sayHello", String.class);
////            压制java的访问控制检查
//            method.setAccessible(true);
//            String print = (String) method.invoke(pm,"张三");

            method = classType.getDeclaredMethod("sayHello", new Class[]{String.class});
            method.setAccessible(true);
            String printResult = method.invoke(pm, new Object[]{"栗子"}).toString();

            System.out.println(printResult);
        } catch (NoSuchMethodException e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw,true));
            String msg = sw.toString();
            System.out.println("异常信息" + msg);
        } catch (IllegalAccessException e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw,true));
            String msg = sw.toString();
            System.out.println("异常信息" + msg);
        } catch (InvocationTargetException e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw,true));
            String msg = sw.toString();
            System.out.println("异常信息" + msg);
        }


    }
}
