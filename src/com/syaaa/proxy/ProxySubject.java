package com.syaaa.proxy;

/**
 * @ClassName ProxySubject
 * @Description TODO
 * @Author APPO
 * @Date 12:29   2018-9-7
 * @Version 1.0
 **/
public class ProxySubject implements Subject {
    private RealSubject realSubject;


    @Override
    public void borrowHouse() {
//        代理对象调用真实对象之前所做的事情
        this.proMessage();

        if(null == realSubject){
            realSubject = new RealSubject();
        }
//        真实的对象所完成的事情
        realSubject.borrowHouse();
//      代理对象调用真实对象之后做的事情
        this.postMessage();
    }


    private void proMessage(){
        System.out.println("开始出租房子了");
    }

    private void postMessage(){
        System.out.println("房子出租出去了");
    }


}
