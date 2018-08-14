package com.syaaa.demo01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @ClassName Java8Demo05
 * @Description TODO
 * @Author APPO
 * @Date 15:49   2018-8-14
 * @Version 1.0
 **/
public class Java8Demo05 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        eval(list, n-> n%2 == 0 );

    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list)  {
            if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }
}
