package com.company;

import java.util.Stack;

public class Longest_valid_parantheses {
    public static void main(String[] args) {

    }
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack =  new Stack<>();
        stack.push(-1);
        int max= 0;

        for (int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if (c=='(') stack.push(i);
            else {
                stack.pop();
                if (stack.isEmpty()) stack.push(i);
                else {
                    int len = i -stack.peek();
                    max = Math.max(len,max);
                }
            }
        }return max;
    }
}
