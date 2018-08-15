package com.syaaa.demo01;

/**
 * @ClassName Java8Demo07
 * @Description TODO
 * @Author APPO
 * @Date 16:15   2018-8-14
 * @Version 1.0
 **/
public class Java8Demo07 {
    /**
     *   静态方法引用
     * @param <P> 引用方法的参数类型
     * @param <R> 引用方法的返回类型
     */
    @FunctionalInterface
    interface FunStaticRef<R,P>{
         R tranTest(P p);
    }

    public static void main(String[] args) {
        /*
         *  静态方法引用: public static String valueOf
         *   即将String的valueOf() 方法引用为 FunStaticRef#tranTest 方法
         */
        FunStaticRef<String,Integer > funStaticRef = String::valueOf;
        String str = funStaticRef.tranTest(10000);

        System.out.println(str.replaceAll("0", "9"));
    }

}

