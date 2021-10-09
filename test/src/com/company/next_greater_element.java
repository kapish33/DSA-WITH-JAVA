package com.company;

import java.util.Scanner;
import java.util.Stack;

public class next_greater_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int text = sc.nextInt();

        for (int i = 0;i<text;i++){
            int size = sc.nextInt();
            int[] array  = new int[size];

            for (int j =0;j<size;j++) array[j]= sc.nextInt();
            answer(array,size);

        }
    }
    public static void answer(int[] arr,int size){
        int[] ans1 =  new int[size];// for left
        Stack<Integer> stack = new Stack<>();
        Stack<Integer>index = new Stack<>();

        for (int i = 0;i<size;i++){
            int element = arr[i];
            while (stack.size()>0 && stack.peek()<=element) stack.pop();
            ans1[i]= stack.size()>0 ? stack.peek() : -1;
            stack.push(element);
        }

        int[] nge = new int[arr.length]; // for right
        Stack<Integer>  st =new Stack<>();
        st.push(arr[arr.length-1]);
        nge[arr.length-1]=-1;
        for (int i = arr.length-2;i>=0;i--){
            while (st.size()>0 && arr[i]>=st.peek()) st.pop();
            if (st.size() == 0) nge[i]=-1;
            else nge[i]=st.peek();
            st.push(arr[i]);
        }

        for (int i = 0;i<size;i++) System.out.print(Math.max(nge[i],ans1[i] )+" ");
    }
}
