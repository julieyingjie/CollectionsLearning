package org.example;

import java.util.Stack;

public class IsPalindrome {

    public static void main(String[] args) {
        String s = "abbcbba";

        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
        }
        String s1 = "";
        while (!stack.isEmpty()){
            s1 += stack.pop();
        }

        return s1.equals(s) ;
    }
}
