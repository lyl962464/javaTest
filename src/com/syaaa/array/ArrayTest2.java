package com.syaaa.array;

import java.lang.reflect.Array;

/**
 * @ClassName ArrayTest2
 * @Description TODO
 * @Author APPO
 * @Date 18:12   2018-9-6
 * @Version 1.0
 **/
public class ArrayTest2 {
    public static void main(String[] args) {
        int[] dims = new int[] {5,10,15};

        /**
         * Integer.TYPE 返回的是int
         * Integer.class 返回对应的Class对象
         */

//        创建一个三维的数组对象，dims指的是维度
        Object array = Array.newInstance(Integer.TYPE,dims);
        Object objArray = Array.get(array,3);
        Class<?> classType = objArray.getClass().getComponentType();

        objArray = Array.get(objArray, 5);
        Array.setInt(objArray,10,37);


        int[][][] result = (int[][][]) array;
        System.out.println(result[3][5][10]);
    }
}
