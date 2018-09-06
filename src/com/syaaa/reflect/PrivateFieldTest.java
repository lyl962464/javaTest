package com.syaaa.reflect;

import com.syaaa.util.PrintUtil;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName PrivateFieldTest
 * @Description TODO
 * @Author APPO
 * @Date 19:27   2018-9-6
 * @Version 1.0
 **/
public class PrivateFieldTest {
    public static void main(String[] args) {

        PrivateFiled pf = new PrivateFiled();

        Class<?> classType = pf.getClass();

        Field field =null;
        try {

            field = classType.getDeclaredField("name");
            field.setAccessible(true);
            field.set(pf,"李四");
            Method method = classType.getDeclaredMethod("getName");
            String result = (String) method.invoke(pf);
            System.out.println(result);
        } catch (NoSuchFieldException e) {
            PrintUtil.printMsgException(e);
        } catch (IllegalAccessException e) {
            PrintUtil.printMsgException(e);
        } catch (NoSuchMethodException e) {
            PrintUtil.printMsgException(e);
        } catch (InvocationTargetException e) {
            PrintUtil.printMsgException(e);
        }


    }
}
