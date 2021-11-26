package com.company;

import java.util.Scanner;
import java.util.Stack;

public class pole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt(); // input tests case
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt(); // inp size of array
            int[] array = new int[size];
            for (int j = 0; j < size; j++) array[j]= sc.nextInt();
            int[] ans = poleheight(array,size);
            for (int j = 0; j < size; j++) {
                System.out.print(ans[j]+" ");
            }
        }
    }
    public static int[] poleheight(int[] array,int size){
        int[] ans = new int[size];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            while (!stack.isEmpty() && array[stack.peek()]<array[i]) stack.pop();
            ans[i] = stack.isEmpty() ? 1 : i - stack.peek();
            stack.push(i);
        }
        return ans;
    }
}
