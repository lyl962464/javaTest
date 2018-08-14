package com.syaaa.demo01;

/**
 * @ClassName Java8Demo03
 * @Description TODO
 * @Author APPO
 * @Date 15:24   2018-8-14
 * @Version 1.0
 **/
public class Java8Demo03 {
    public static void main(String[] args) {
        SayMessage sayMessage = msg -> {
            msg = "sdafas";
            System.out.println(msg);
        };
        sayMessage.getMessage("one");
    }

    interface SayMessage{
        void getMessage(String msg);
    }
}
