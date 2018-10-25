package com.syaaa.thread;

/**
 * @author syaaa
 * @version 1.0
 * @date 17:18   2018-10-10
 **/
public class Problem01 {
    /**
     *
     * 问题：
     *      创建两个线程，其中一个输出1-52，另外一个输出A-Z。
     *      输出格式要求：12A 34B 56C 78D
     *
     * 分析：
     *       需要创建两个线程，一个进行数字的输出，另一个进行字符的输出。
     *       主要是两个线程之间的阻塞和唤醒的操作需要考虑清楚
     *       在什么时候进行线程的唤醒，在什么时候进行线程的阻塞
     *
     *
     *
     *
     */

    public static void main(String[] args) {
        Object object = new Object();
        new Thread(new Number(object)).start();
        new Thread(new Character(object)).start();

        /**/
        new Thread(){}.start();

    }



}
/**
 *
 * 进行输出数字的线程
 *
 *@author  syaaa
 *@date 17:28  2018-10-10
 *@version 1.0
 **/
class Number implements Runnable{

    private Object object;

    public Number(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object){
            /*定义数字循环的次数*/
            int size =53;
            for (int i = 1; i < size; i++) {

                /*当i为奇数的时候，输出换行*/
                if (i>1&&i%2==1) {
                    System.out.println(" ");
                }
                System.out.print(i);
                /*i为偶数时，进行数字阻塞*/
                if (i%2 == 0) {
                    /*先进行锁的释放，唤醒其他的线程，再使本线程阻塞*/
                    object.notifyAll();
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }
}
/**
 *
 * 进行输出字符的线程
 *@author  syaaa
 *@date 17:28  2018-10-10
 *@version 1.0
 **/
class Character implements Runnable{

    private Object object;

    public Character(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized(object){
            char c = 'Z';
            for (char i = 'A'; i <=c ; i++) {

                System.out.print(i);
                /*先唤醒其他的线程，然后再使本线程阻塞*/
                object.notifyAll();
                /*线程执行到最后一次的时候，不能进行阻塞，不然线程会一致的阻塞下去*/
                if (i < 'Z') {
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

