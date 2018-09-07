package com.syaaa.proxy;

/**
 * @ClassName RealSubject
 * @Description TODO
 * @Author APPO
 * @Date 12:28   2018-9-7
 * @Version 1.0
 **/
public class RealSubject implements Subject {
    @Override
    public void borrowHouse() {
        System.out.println("From Real Subject");
    }
}
