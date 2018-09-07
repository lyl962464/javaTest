package com.syaaa.proxy;

/**
 * @ClassName Man
 * @Description TODO
 * @Author APPO
 * @Date 15:50   2018-9-7
 * @Version 1.0
 **/
public class Man implements Person {
    @Override
    public String say(String name) {
        return "this is "+name;
    }
}
