package day05;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName SetTest1
 * @Description Set集合练习
 * @Author APPO
 * @Date 17:04   2018-7-27
 * @Version 1.0
 **/
public class SetTest1 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("1");
        set.add("1");
        set.add("1");
        set.add("1");
        set.add("1");
        set.add("1");
        set.add("1");

        System.out.println(set);


    }
}
