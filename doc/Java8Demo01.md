##Java8有什么新特性？？
新功能：
     1. Lamdba表达式-增加函数处理能力到java
     2.默认方法-接口有默认方法实现
     3.方法引用-引用函数有他们名称，而不是直接调用他们。使用函数的参数。
     4.新工具-新的编译器工具和实现程序被添加
     5.数据流API - 新数据流的API，以方便数据流处理。
     6.日期时间API - 改进日期时间API。
     7.可选- 强调最佳实践，妥善处理空(null)值。
     8.Nashorn , JavaScript引擎 - 一个基于JAVA引擎执行JavaScript代码。
     
``
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

``

lambda表达式主要用于定义内联执行的功能的接口，即只有一个单一的方法接口。
在上面的例子中，我们使用不同类型的lambda表达式定义MathOperation接口的opearation方法。
然后，我们定义GreetingService的sayMessage实现。

Lambda表达式消除匿名类的需求，并给出了一个非常简单但功能强大的函数式编程能力。


##变量的作用域

在lambda表达式，可以指任何最终的变量或有效的最后一个变量（被分配一次）。如果变量被二次赋值，lambda表达式将抛出编译错误。

