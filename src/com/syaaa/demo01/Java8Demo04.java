package com.syaaa.demo01;


/**
 * @ClassName Java8Demo04
 * @Description TODO
 * @Author APPO
 * @Date 15:28   2018-8-14
 * @Version 1.0
 **/
public class Java8Demo04 {
    public static void main(String[] args) {
        String str = "adfasdf";
        GetList g = str::toUpperCase;
        System.out.println(g.getList());
    }

    @FunctionalInterface
    interface  GetList{
        String getList();
    }
}
