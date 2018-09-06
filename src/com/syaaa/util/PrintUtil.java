package com.syaaa.util;

import com.sun.org.glassfish.gmbal.Description;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @ClassName PrintUtil
 * @Description TODO
 * @Author APPO
 * @Date 19:34   2018-9-6
 * @Version 1.0
 **/
public class PrintUtil {

    /**
     * @Author APPO
     * @Description //TODO  输出异常信息
     * @Date 19:36 2018-9-6
     * @Param
     * @return
     **/
    public static void printMsgException(Exception e){

        StringWriter writer = new StringWriter();
        e.printStackTrace(new PrintWriter(writer,true));
        String msg = writer.toString();
        System.out.println("异常信息为" + msg);
    }


}
