package com.syaaa.demo02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName TestDemo01
 * @Description TODO
 * @Author APPO
 * @Date 16:59   2018-8-15
 * @Version 1.0
 **/
public class TestDemo01 {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    static class Student{
        private String name;
        private String address;
    }



    interface  IMessage<C>{
        C  print(String name,String address);
    }

    public static void main(String[] args) {
        IMessage<Student> message = Student::new;
        System.out.println(message.print("张三","吉林"));
    }



}
