package com.syaaa.pattern;

/**
 * @ClassName FactoryProducer
 * @Description TODO
 * @Author APPO
 * @Date 10:20   2018-9-7
 * @Version 1.0
 **/
public class FactoryProducer {

    public static AbstractShowFactory getFactory(String msg){
        if("fa".equals(msg)){
            return new ShowFactory();
        }
        return  null;
    }

}
