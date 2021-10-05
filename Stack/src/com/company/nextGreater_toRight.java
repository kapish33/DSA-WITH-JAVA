package com.company;

import java.util.Stack;

public class nextGreater_toRight {
    public static void main(String[] args) {
        int[] array = {2,5,9,3,1,12,6,8,7};
        int[] answer = nextGreaterToLeft(array);
        for (int i = 0;i< answer.length;i++) System.out.print(answer[i]+" ");
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
}
