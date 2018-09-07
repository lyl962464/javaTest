package com.syaaa.pattern;

/**
 * @ClassName ShowFactory
 * @Description TODO
 * @Author APPO
 * @Date 10:10   2018-9-7
 * @Version 1.0
 **/
public class ShowFactory extends AbstractShowFactory  {


    @Override
    public FactoryInterface getShow(String ag) {
        if("1".equals(ag)){
            return new FactoryInterfaceImpl1();
        }else {
            return new FactoryInterfaceImpl2();
        }
    }
}
