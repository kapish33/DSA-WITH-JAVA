package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Stock_Span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i <size ; i++) {
            array[i]=sc.nextInt();
        }
        int[] ans = stockSpan(array);
        for (int i = 0; i < size; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] stockSpan(int[] array){
        int[] ans = new int[array.length];
        Stack<Integer> st= new Stack<>();

        for (int i = 0; i < array.length; i++) {
            while (!st.isEmpty() && array[i] > array[st.peek()]) st.pop();
            ans[i]= st.isEmpty() ? i+1 : i-st.peek();
            st.push(i);
        }
        return ans;
    }
}
