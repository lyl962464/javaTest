package day02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassNameMapTest
 * @Description TODO
 * @AuthorAPPO
 * @Date 19:412018-7-23
 * @Version 1.0
 **/
public class MapTest {
    public static void main(String[] args) {
        /**
         * 循环一个字符串数组，记录每次字母出现的次数，
         *
         *  采用HashMap的方式记录
         */

        String[] strs ={"a","s","a","d","s","k","h"};

        HashMap map = new HashMap();
        int length =strs.length;


        for (int i = 0; i < length; i++) {
            /**
             * 循环遍历数组，判断在指定的HashMap中出现指定的值，如果没有出现，则把值以key的形式放入map中。
             * value值设置为1，如果出现，则value值加1
             */


            if (map.get(strs[i]) == null) {
                map.put(strs[i], new Integer(1));
            } else {
                Integer num = (Integer) map.get(strs[i]);
                /**
                 * num.intValue() 指定的是将该整数的值以int类型返回，
                 */
                num = new Integer(num.intValue()+1);
                map.put(strs[i],num);
            }

        }


        /*int result =0;
        for (int i = 0; i < length; i++) {
            if (map.get(strs[i]) == null) {
                result = 1;
                map.put(strs[i], result);
            } else {
                result++;
                map.put(strs[i],result);
            }

        }*/


        /**
         * 对Map进行循环遍历
         */

        Set set =map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            String key = (String)iterator.next();
            Integer value =(Integer)map.get(key);
            System.out.println(key +"："+value);
        }



    }
}
