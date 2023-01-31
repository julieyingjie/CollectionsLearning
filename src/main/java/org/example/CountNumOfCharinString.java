package org.example;

import java.util.*;

public class CountNumOfCharinString {
    public static void main(String[] args) {
        String s = "aaabcdessf";

        System.out.println(CountNumOfCharinString4(s));

        // a:3
        // b:1
    }

    public static Map<Character, Integer> CountNumOfCharinString1(String s){
        if (s == null) throw new RuntimeException("String can not be null");
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();

        for (char ch: chars) {
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else map.put(ch, 1);
        }

        return map;
    }

    public static Map<Character, Integer> CountNumOfCharinString(String s){
        if (s == null) throw new RuntimeException("String can not be null");
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();

        for (char ch: chars) {
            if (map.get(ch) == null) map.put(ch, 1);
            else map.put(ch, map.get(ch) + 1);
        }

        return map;

        }

    public static Map<Character, Integer> CountNumOfCharinString3(String s){
        if (s == null) throw new RuntimeException("String can not be null");
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();

        for (char ch: chars) {
            if (map.get(ch) == null) map.put(ch, 0);
            map.put(ch, map.get(ch) + 1);
        }

        return map;

    }


    public static List<Node> CountNumOfCharinString4(String s) {
        if (s == null) throw new RuntimeException("String can not be null");
        List<Node> list = new ArrayList<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            Node node = new Node();
            node.setKey(chars[i]);
            if (list.contains(node)){
                list.get(list.indexOf(node)).value += 1;
            }else {
                node.setValue(1);
                list.add(node);
            }

        }

        return list;

    }

    //封装一个类似hash map的写法，封装一个node
    private static class Node{
        Character key;
        Integer value;

        public Character getKey() {
            return key;
        }

        public void setKey(Character key) {
            this.key = key;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return this.key == node.key;
        }

        @Override
        public String toString() {
            return " key = " + key + ", value = " + value;
        }


    }



}
