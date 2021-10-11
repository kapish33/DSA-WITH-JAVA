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
        int[] left =  new int[size];// for left
        Stack<Integer> stack = new Stack<>();

        for (int i = 0;i<size;i++){
            int element = arr[i];
            while (stack.size()>0 && arr[stack.peek()]<=element) stack.pop();
            left[i]= stack.size()>0 ? stack.peek() : -1;
            stack.push(i);
        }
        //for (int i = 0;i<size;i++) System.out.print(ans1[i]+" "); //test for gettting next greater to left
        //System.out.println();

        int[] right = new int[arr.length]; // for right
        Stack<Integer>  st =new Stack<>();
        st.push(arr[arr.length-1]);
        right[arr.length-1]=-1;
        for (int i = arr.length-2;i>=0;i--){
            while (st.size()>0 && arr[i]>=arr[st.peek()]) st.pop();
            if (st.size() == 0) right[i]=-1;
            else right[i]=st.peek();
            st.push(i);
        }
//        for (int i = 0;i<size;i++) System.out.print(nge[i]+" "); test for gettting next greater to right
        int[] ans = new int[size];
        for (int i=0;i<left.length;i++){
            if (left[i] == -1 && right[i] == -1) ans[i] = -1;
            else if (left[i] == -1 ) ans[i] = right[i];
            else if (right[i] == -1) ans[i] = left[i];
            else{
                int temp1 = Math.abs(i - left[i]); //finding the absolute difference
                int temp2 = Math.abs(i - right[i]); // finding the absolute difference
                ans[i] = temp1 > temp2 ? right[i] : left[i];
            }
        }
        for (int i:ans) {
            if (i == -1) System.out.print(-1+" ");
            else System.out.print(arr[i]+" ");
        }
    }
}
