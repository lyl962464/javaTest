package com.syaaa.thread;

/**
 *@author APPO
 *@date 16:30  2018-9-30
 *@version 1.0
 **/
public class ThreadTest {


    /**
     *@author APPO
     *@date 16:31  2018-9-30
     *@version 1.0
     **/
    public static class ThreadDemo extends Thread{
        @Override
        public void run() {

            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+"thread");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



   /**
    *@author APPO
    *@date 16:31  2018-9-30
    *@version 1.0
    **/
    public static class RunnableTest  implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+"runnable");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
 
    /**
     * @author APPO
     * @date 16:31 2018-9-30
     * @param args
     * @return void
     **/
    public static void main(String[] args) {
        Thread t = new ThreadDemo();
        Thread t2 =new Thread( new RunnableTest());
        t2.start();
        t.start();


    }

}
