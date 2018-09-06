package com.syaaa.array;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Array;

/**
 * @ClassName ArrayTest1
 * @Description TODO
 * @Author APPO
 * @Date 17:49   2018-9-6
 * @Version 1.0
 **/
public class ArrayTest1 {

    public static void main(String[] args) {
        try {
            Class<?> classType = Class.forName("java.lang.String");
            Object object = Array.newInstance(classType,10);
            Array.set(object,5,"测试");
            String str = (String) Array.get(object,5);
            System.out.println(str);


        }catch (ClassNotFoundException e){
//            对异常信息进行打印输出
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter,true));
            String msg = stringWriter.toString();
            System.out.println("异常信息为" + msg);
        }

    }
}
