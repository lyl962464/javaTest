package com.syaaa.reflect;

/**
 * @ClassName ClassTest
 * @Description TODO
 * @Author APPO
 * @Date 19:48   2018-9-6
 * @Version 1.0
 **/
public class ClassTest {

    public static void main(String[] args) {

        Class<?> classType = Student.class;

        System.out.println(classType.getName());

        classType = classType.getSuperclass();

        System.out.println(classType.getName());

        classType = classType.getSuperclass();

        System.out.println(classType.getName());


    }


}
class  Parent{

}

class  Student extends Parent{

}
