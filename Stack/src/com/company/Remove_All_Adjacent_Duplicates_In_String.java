package com.company;

import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_In_String {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
    public static String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i<s.length();i++){
            if (stack.isEmpty() || stack.peek()!=s.charAt(i)){
                stack.push(s.charAt(i));
            }else stack.pop();
        }
        for (char c: stack) {
            ans.append(c);
        }
        return ans.toString();
    }
}
