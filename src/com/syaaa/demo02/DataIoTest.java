package com.syaaa.demo02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName DataIoTest
 * @Description TODO
 * @Author APPO
 * @Date 14:04   2018-8-15
 * @Version 1.0
 **/
public class DataIoTest {

    /**
     * 使用Java8，Collection 接口有两个方法来生成流。
     * stream() -返回顺序流考虑集合作为其源。
     * parallelStream() - 返回并行数据流考虑集合作为其源。
     * @param args
     */
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        filtered.forEach(System.out::println);
    }
}
