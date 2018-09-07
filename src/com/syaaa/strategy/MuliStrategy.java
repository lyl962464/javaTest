package com.syaaa.strategy;

/**
 * @ClassName MuliStrategy
 * @Description TODO
 * @Author APPO
 * @Date 12:20   2018-9-7
 * @Version 1.0
 **/
public class MuliStrategy implements Strategy {
    @Override
    public int calucate(int a, int b) {
        return  a * b;
    }
}
