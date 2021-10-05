package com.company;

import java.util.Scanner;
import java.util.Stack;

public class balanced_Brackets {
    public static void main(String[] args) {
        String sam = "(){()[]}";
        System.out.println(balanced_brackets(sam));
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),y= sc.nextInt(),z= sc.nextInt(),k= sc.nextInt();
        System.out.println(x*y+z*k);
    }
    public static boolean balanced_brackets(String sam){
        Stack<Character> stack = new Stack<>();
        for (int i =0;i<sam.length();i++){
            if (sam.charAt(i)=='(' || sam.charAt(i)=='[' || sam.charAt(i)=='{'){
                stack.push(sam.charAt(i));
            }else if((sam.charAt(i)==')' || sam.charAt(i)==']' || sam.charAt(i)=='}') && !stack.empty()){
                if(stack.peek()=='(' || stack.peek()=='{' || stack.peek()=='[' ){
                    stack.pop();
                }else return false;
            }else return false;
        }
        return stack.isEmpty();
    }
}
