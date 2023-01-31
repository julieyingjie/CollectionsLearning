package org.example;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        test2();
    }

    public static void test2(){
        // <key, value>
        Map<String, Integer> map = new HashMap<>();
        map.put("Jack", 10);
        map.put("Rose", 11);
        map.put("Jim", 12);
        map.put("Jack", 13);
        map.put("kate", 14);

//        Set<String> keys = map.keySet();
//        for (String key: keys) {
//            System.out.print(key + " ");
//        }

//        Collection<Integer> values = map.values();
//        for (Integer v: values) {
//            System.out.print(v + " ");
//        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry:entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("key " + key + ", value: " + value);
        }

    }

    public static void test1(){
        Map<String, Integer> map = new HashMap<>();
        map.put("Jack", 10);
        map.put("Rose", 11);
        map.put("Jim", 12);
        map.put("Jack", 13);
        map.put("kate", 14);
        System.out.println(map.size()); // map里也不能存储相同key值的元素；Value可以相同，但是key不可以
        System.out.println(map.get("Jack"));
        System.out.println(map);
//        map.remove("Rose");
    }

    public static void test(){

//        Set<String> set = new TreeSet<>(); 升序排列
        Set<String> set = new TreeSet<>();
        set.add("Jack");
        set.add("Rose");
        set.add("Jim");
        set.add("Jack");
        set.add("Kate");

        set.forEach( (s)-> {
                System.out.print(s + " "); // LinkedHashSet 的装入是有序的， 但是如果不需要的话，就不要用这个，成本太高
                // TreeSet 的存放是按字母顺序，或数字顺序从小到大来存放的，存放数据必须具备可比较性
            });

//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }

//        for (String element: set) {
//            System.out.print(element); // HashSet打印结果是无序的
//        }

//        System.out.println(set.size()); // size = 4   set当中不能装重复的数据；所以两个"Jack"只能保留下来一份
//        System.out.println(set); // 添加进去的元素是无序的。HashSet当中有一些函数导致的
//        set.remove("Rose"); // 返回的是个boolean的值



    }
}