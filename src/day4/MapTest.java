package day4;

import java.util.*;

/**
 * @ClassName MapTest
 * @Description TODO
 * @Author APPO
 * @Date 13:22   2018-7-25
 * @Version 1.0
 **/
public class MapTest {


    /**
     * 要求实现：
     *      随机生成数字[10-50]
     *      采用集合的方式
     *      记录每一次数字出现的次数
     *      打印出出现次数最多的数字
     *      按照升序的方式排序集合中的数字
     *      出现次数为0时，则不输出
     *
     *
     * @param args
     */

    public static void main(String[] args) {

        Map map = new HashMap();
        Random random = new Random();

        for (int i =0 ;i<50;i++) {
//         定义一个随机数，在[10-50];
            int in = random.nextInt(41)+10;
//            将in转换成Integer对象
            Integer num = new Integer(in);
//         判断生成的数是否在集合中
            if (map.get(num) == null) {
                map.put(num, new Integer(1));
            } else {
                int value = ((Integer) map.get(num)).intValue();
                map.put(num, new Integer(value + 1));
            }

        }

        //        获取出现次数最多
        Collection collection = map.values();
        Integer maxOCount =(Integer) Collections.max(collection);
        //     遍历集合
        Set set = map.entrySet();
        List list  = new ArrayList();

        for(Iterator iterator = set.iterator();iterator.hasNext();){
            Map.Entry entry = (Map.Entry)iterator.next();


            Integer key = (Integer) entry.getKey();
            Integer value = (Integer) entry.getValue();
            // 值的出现次数，如果等于最大的出现的次数的时候，将该值添加到集合当中去。

            if (value.intValue() == maxOCount.intValue()){
                list.add(key);
            }
            System.out.println(key+":"+value);
        }



        System.out.println("出现最多的次数为"+maxOCount);
        System.out.println("数字为：");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
