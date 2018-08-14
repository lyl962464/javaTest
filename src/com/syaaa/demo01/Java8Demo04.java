package com.syaaa.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Java8Demo04
 * @Description TODO
 * @Author APPO
 * @Date 15:28   2018-8-14
 * @Version 1.0
 **/
public class Java8Demo04 {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach(System.out::println);





    }

    class  GetList{
        public  void getList(List names){
            names.forEach(System.out::println);
        }
    }
}
