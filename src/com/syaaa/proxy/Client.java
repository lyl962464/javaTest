package com.syaaa.proxy;

/**
 * @ClassName Client
 * @Description TODO
 * @Author APPO
 * @Date 12:33   2018-9-7
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.borrowHouse();
    }
}
