package day03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @ClassNameMapTest
 * @Description TODO
 * @AuthorAPPO
 * @Date 17:092018-7-24
 * @Version 1.0
 **/
public class MapTest {

    /***
     * 采用entrySet的方式遍历map
     * @param args
     */
    public static void main(String[] args) {

        HashMap hashMap = new HashMap();


        hashMap.put("a","aa");
        hashMap.put("b","bb");
        hashMap.put("v","vv");
        hashMap.put("s","ss");
        hashMap.put("z","zz");

        /**
         * 返回此映射中包含的映射的集合视图。
         */

        Set set = hashMap.entrySet();

        for (Iterator iterator = set.iterator();iterator.hasNext();) {
            Map.Entry <String,String> map = (Map.Entry)iterator.next();
            String key = map.getKey();
            String value =  map.getValue();
            System.out.println(key+":"+value);
        }





    }

}
