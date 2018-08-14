package com.syaaa.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName Java8Demo01
 * @Description TODO
 * @Author APPO
 * @Date 14:46   2018-8-14
 * @Version 1.0
 **/
public class Java8Demo01 {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<String>();
        names1.add("Mahesh ");
        names1.add("Suresh ");
        names1.add("Ramesh ");
        names1.add("Naresh ");
        names1.add("Kalpesh ");

        List<String> names2 = new ArrayList<String>();
        names2.add("Mahesh ");
        names2.add("Suresh ");
        names2.add("Ramesh ");
        names2.add("Naresh ");
        names2.add("Kalpesh ");

        Java8Demo01 tester = new Java8Demo01();

        System.out.println("Sort using Java 7 syntax: ");
        tester.sortUsingJava7(names1);
        System.out.println(names1);

        System.out.println("Sort using Java 8 syntax: ");
        tester.sortUsingJava8(names2);
        System.out.println(names2);
    }

    private void sortUsingJava7(List<String> names){
        //sort using java 7
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

//    在这里，sortUsingJava8（）方法使用排序功能使用一个lambda表达式作为参数，以获得排序条件。

    private void sortUsingJava8(List<String> names){
        //sort using java 8
        Collections.sort(names, (s1, s2) ->  s1.compareTo(s2));

    }
}
