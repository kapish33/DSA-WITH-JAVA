package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Minimum_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper =  sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int min =-1;
        for (int i = 0;i<oper;i++){
            String inp = sc.next();

            if (inp.equals("push")) stack.push(sc.nextInt());
            else if(inp.equals("pop")) stack.pop();
            else if (inp.equals("getMin")) System.out.println(getMin(stack));
//            System.out.println(stack);
        }
    }
    public static int getMin(Stack<Integer> st){
        int min = 1000000;
        for (Integer i :st) {
            if (min>i) min=i;
        }
        return min;
    }
}
