package com.syaaa.strategy;

/**
 * @ClassName AddStrategy
 * @Description TODO
 * @Author APPO
 * @Date 12:19   2018-9-7
 * @Version 1.0
 **/
public class AddStrategy implements Strategy {
    @Override
    public int calucate(int a, int b) {
        return a + b;
    }
}
