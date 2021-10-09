package com.company;

import java.util.Scanner;
import java.util.Stack;

public class balanced_Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times= sc.nextInt();
        for (int i = 0;i<times;i++){
            String inp = sc.next();
            System.out.println(balanced_brackets(inp));
        }
    }
    public static String balanced_brackets(String sam){
        Stack<Character> stack = new Stack<>();
        for (int i =0;i<sam.length();i++){
            if (sam.charAt(i)=='(' || sam.charAt(i)=='[' || sam.charAt(i)=='{'){
                stack.push(sam.charAt(i));
            }else if((sam.charAt(i)==')' || sam.charAt(i)==']' || sam.charAt(i)=='}') && !stack.empty()){
                if(stack.peek()=='(' || stack.peek()=='{' || stack.peek()=='[' ){
                    stack.pop();
                }else return "not balanced";
            }else return "not balanced";
        }
        if (stack.isEmpty()) return "balanced";
        else return "not balanced";
    }
}
