package com.syaaa.demo02;

import java.util.function.Supplier;

/**
 * @ClassName StudentTest
 * @Description TODO
 * @Author APPO
 * @Date 11:59   2018-8-15
 * @Version 1.0
 **/
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("张三",11,11.0);
        Supplier<String> s  = student::getStudentName;
        System.out.println(s.get());
    }
}
