package day02;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @ClassNameTreeSetTest
 * @Description TreeSet集合的练习
 * @AuthorAPPO
 * @Date 16:102018-7-23
 * @Version 1.0
 **/
public class TreeSetTest {

    public static void main(String[] args) {
        /***
         * 继承体系：treeSet继承abstractSet；abstractSet继承AbstractColleaction；
         */
        TreeSet treeSet = new TreeSet(new PersonComparator());

//        treeSet.add("A");
//        treeSet.add("B");
//        treeSet.add("C");
//        treeSet.add("D");
//        treeSet.add("E");
//        treeSet.add("F");

        Person p1 = new Person(10);
        Person p2 = new Person(20);
        Person p3 = new Person(30);
        Person p4 = new Person(40);
        Person p5 = new Person(50);

        /**
         *
         * Exception in thread "main"
         * java.lang.ClassCastException: day02.Person cannot be cast to java.lang.Comparable
         * 没有定义对象的排序规则
         *
         */
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);
        treeSet.add(p5);

        /**
         * Set集合的遍历采用的是迭代器的方式，
         */
        Iterator iterator = treeSet.iterator();
        /**
         * 采用while循环进行遍历
         */
//        while(iterator.hasNext()){
//            String next = (String) iterator.next();
//            System.out.println(next);
//        }
        /**
         * 采用for循环进行遍历
         */
        for (Iterator iter = treeSet.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next()+"---");
        }

    }
}

class Person{

    int score;

    public Person(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return String.valueOf(this.score);
    }
}

/**
 * 定义Person 对象的排序规则
 */
class PersonComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Person person1 = (Person)o1;
        Person person2 = (Person)o2;
        return person2.score-person1.score;
    }
}



/**
 * 定义自己的排序规则，首先要定义定义自己的类，实现Comparable接口
 * 使字符串倒序排列
 *
 */
class TreeSetComp implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String param1 = (String)o1;
        String param2 = (String)o2;
        return param2.compareTo(param1);
    }
}
