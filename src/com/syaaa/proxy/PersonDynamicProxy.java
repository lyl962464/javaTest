package com.syaaa.proxy;

import java.lang.reflect.Proxy;

/**
 * @ClassName PersonDynamicProxy
 * @Description TODO
 * @Author APPO
 * @Date 15:53   2018-9-7
 * @Version 1.0
 **/
public class PersonDynamicProxy {

    public static void main(String[] args) {

        Person p = null;

        DynamicProxy dp = new DynamicProxy();

        dp.setProxyObjet(new Student());

        p = (Person) Proxy.newProxyInstance(dp.getClass().getClassLoader(),new Class[]{Person.class},dp);

        String stuMsg = p.say("student");
        System.out.println(stuMsg);

        System.out.println("==================");

        dp.setProxyObjet(new Man());
        p = (Person) Proxy.newProxyInstance(dp.getClass().getClassLoader(),new Class[]{Person.class},dp);

        String manMsg =  p.say("man");
        System.out.println(manMsg);


    }
}
