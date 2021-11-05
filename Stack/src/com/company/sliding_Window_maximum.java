package com.company;

import java.util.Scanner;
import java.util.Stack;

public class sliding_Window_maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i]= sc.nextInt();
        int slice =  sc.nextInt();
        int[] ans = max_in_k_sized_window(array,slice,size);
    }
    public static int[] max_in_k_sized_window(int[] array,int k,int size){
        // first let's find ngl to right;
        Stack<Integer> st = new Stack<>();
        int[] ngl = new int[size];
        st.push(array.length-1);
        ngl[array.length-1]= size;
        for (int i = size-2; i >=0; i--) {
            // + a pop +a
            while (!st.isEmpty() && array[i]>=array[st.peek()]) st.pop();
            ngl[i] = st.isEmpty() ? size: st.peek();
            st.push(i);
        }
        // now  twist comes
        for (int i = 0; i <= size-k ; i++) {
            int j = i;
            while (ngl[j] < i+k) j = ngl[j];
            System.out.println(array[j]);
        }
    }

}
