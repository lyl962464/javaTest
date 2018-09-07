package com.syaaa.strategy;

/**
 * @ClassName Client
 * @Description TODO
 * @Author APPO
 * @Date 12:23   2018-9-7
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        AddStrategy strategy = new AddStrategy();
        Environment environment = new Environment(strategy);
        int result =environment.calculate(8,5);
        System.out.println(result);
    }
}
