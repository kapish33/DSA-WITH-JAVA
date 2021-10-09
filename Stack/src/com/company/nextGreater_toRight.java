package com.company;

import java.util.Stack;

public class nextGreater_toRight {
    public static void main(String[] args) {
        int[] array = {5,4,1,2,3};
        int[] answer = nextGreaterToLeft(array);
        int[] answer1 = nextGreaterToLeft(array);
        for (int i = 0;i< answer.length;i++) System.out.print(answer[i]+" ");
        System.out.println();
        for (int i = 0;i< answer.length;i++) System.out.print(answer1[i]+" ");
    }
    public static int[] nextGreaterToLeft(int[] arr) {
        int[] nge = new int[arr.length];

        Stack<Integer>  st =new Stack<>();
        st.push(arr[arr.length-1]);
        nge[arr.length-1]=-1;
        for (int i = arr.length-2;i>=0;i--){
            while (st.size()>0 && arr[i]>=st.peek()) st.pop();
            if (st.size() == 0) nge[i]=-1;
            else nge[i]=st.peek();
            st.push(arr[i]);
        }
        return nge;
    }
    public static int[] nextGreaterToLeftAnother(int[] arr){
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 0;i< arr.length;i++){
            while (st.size()>0 && arr[i]>arr[st.peek()]){
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size() >0){
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        return nge;
    }
}
