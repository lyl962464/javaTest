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
//        Supplier<String> s  = student::getStudentName;
//        String name =s.get();
//        IStudent stu;
//        stu = ()-> {
//          if("张三".equals(name)){
//              Supplier<Double> score  = student::getStudentScore;
//              return score;
//          }
//          return null;
//        };
//        stu.getScore(name);
    }
}
