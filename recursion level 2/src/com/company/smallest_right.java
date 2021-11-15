package com.company;

import java.util.Scanner;
import java.util.Stack;

public class smallest_right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]= sc.nextInt();
        }
        System.out.println(nsr(array));
    }
    public static int nsr(int[] array){
        int count = array.length;
        Stack<Integer> stack = new Stack<>();
        int[] ansarr = new int[array.length];
        for (int i = array.length-1; i >=0 ; i--) {
            while (!stack.isEmpty() && stack.peek()>array[i]) stack.pop();
            ansarr[i]= stack.isEmpty() ? -1 : stack.peek();
            stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (ansarr[i]!= -1) count--;
        }
        return count;
    }
}
