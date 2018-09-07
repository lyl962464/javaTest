package com.syaaa.pattern;

/**
 * @ClassName AbstractFactoryPatternDemo
 * @Description TODO
 * @Author APPO
 * @Date 10:23   2018-9-7
 * @Version 1.0
 **/
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractShowFactory asf = FactoryProducer.getFactory("fa");
       FactoryInterface fif = asf.getShow("88");
       fif.show();
    }
}
