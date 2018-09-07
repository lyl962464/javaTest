package com.syaaa.proxy;

/**
 * @ClassName Student
 * @Description TODO
 * @Author APPO
 * @Date 15:49   2018-9-7
 * @Version 1.0
 **/
public class Student implements Person {
    @Override
    public String say(String name) {
        return "Hello" + name;
    }
}
