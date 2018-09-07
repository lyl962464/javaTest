package com.syaaa.strategy;

/**
 * @ClassName Environment
 * @Description TODO
 * @Author APPO
 * @Date 12:20   2018-9-7
 * @Version 1.0
 **/
public class Environment {

    private  Strategy strategy;

    public Environment(Strategy strategy) {
        this.strategy =strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int a,int b){
       return strategy.calucate(a,b);
    }
}
