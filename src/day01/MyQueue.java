package day01;

import java.util.LinkedList;

/***
 * 采用LinkedList的方式实现队列
 * @author APPO
 */
public class MyQueue {
    private LinkedList list = new LinkedList();


    /**
     * 将元素放入对列当中
     * @param o
     */
    public void put(Object o){
        list.add(o);
    }

    /***
     * 取出队列中的第一个元素
     * @return
     */
    public Object get(){
        return list.removeFirst();
    }

    /**
     * 取出队列中最后一个放入的值
     * @return
     */
    public Object getLast(){
        return list.removeLast();
    }

    /***
     * 判断元素是否为空
     * @return
     */

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        System.out.println("将元素放入队列当中===");
        myQueue.put("1");
        myQueue.put("2");
        myQueue.put("3");
        myQueue.put("4");
        myQueue.put("5");
        myQueue.put("6");
        myQueue.put("7");
        myQueue.put("8");
        myQueue.put("9");
        System.out.println(myQueue.get());
        System.out.println(myQueue.getLast());

        System.out.println("判断队列是否为空，如果为空请自动添加值===");
        if (myQueue.isEmpty()) {
            myQueue.put("10");
        }else{
            for (int i = 0; i < myQueue.list.size(); i++) {
                System.out.println(myQueue.list.get(i));
            }
        }
    }


}
