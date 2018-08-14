package com.syaaa.demo01;

/**
 * @ClassName Java8Demo02
 * @Description TODO
 * @Author APPO
 * @Date 14:55   2018-8-14
 * @Version 1.0
 **/
public class Java8Demo02 {
    public static void main(String[] args) {
        Java8Demo02 java8Demo02 = new Java8Demo02();

        MathOperation addOperation = (int a, int b) -> a + b;

        MathOperation subtraction = (a, b) -> {
            if(a<0){
                return 0;
            }else {
                return a - b;
            }
        };

        MathOperation multiplication = (a,b) ->{
          if(a==0||b == 0){
              return  0;
          }  else{
              return a * b;
          }
        };
        MathOperation division = (a,b) -> {
            if (b == 0) {
                throw new RuntimeException("被除数不能为0");
            } else {
                return a / b;
            }
        };

        System.out.println(java8Demo02.operate(8, 0, multiplication));

        GreetingService greetingService = msg -> {
            System.out.println("你好"+msg);
        };
        greetingService.sayMessage("Lambda");


    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
