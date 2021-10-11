package com.company;

import java.util.Scanner;
import java.util.Stack;

public class index_of_ngl_left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times= sc.nextInt();
        for (int t = 0;t<times;t++){
            int size = sc.nextInt();
            int[] que = new int[size];
            for (int j=0;j<size;j++) que[j]= sc.nextInt();

//            int[] que = {1,2,6,3,8,4,6,2,6};
//            int size = que.length;

            int[] ans_l = next_greater_to_left(que,size);
            int[] ans_r = next_greater_to_right(que,size);
            int[] ans = getAnswer(ans_l,ans_r,size,que);
/*
            for (int i : ans_l) System.out.print(i+" ");
            System.out.println();
            for (int i : ans_r) System.out.print(i+" ");
            System.out.println();
*/
            for (int i : ans) {
                if (i==-1) System.out.print(-1+" ");
                else System.out.print(que[i]+" ");
            }
            System.out.println();
        }

    }
    public static int[] next_greater_to_left(int[] arr,int size){
        int[] ans_next_greater_left = new int[size];
        Stack<Integer> stack = new Stack<>();
        for (int  i = 0;i<size;i++){
            while (!stack.isEmpty() && arr[stack.peek()]<=arr[i]) stack.pop();
            ans_next_greater_left[i]=stack.isEmpty() ? -1 :stack.peek();
            stack.push(i);
        }
        return ans_next_greater_left;
    }
    public static int[] next_greater_to_right(int[] arr,int size){
//        int[] que = {1,2,6,3,8,4,6,2,6};
        int[] ans_next_greater_right = new int[size];
        Stack<Integer> stack = new Stack<>();
        for (int  i = size-1;i>=0;i--){
            while (!stack.isEmpty() && arr[stack.peek()]<=arr[i]) stack.pop();
            ans_next_greater_right[i]=stack.isEmpty() ? -1 :stack.peek();
            stack.push(i);
        }
        return ans_next_greater_right;
    }
    public static int[] getAnswer(int left[], int right[],int size,int[] arr){
        int[] ans = new int[size];
        for (int i=0;i<left.length;i++){
            if (left[i] == -1 && right[i] == -1) ans[i] = -1;
            else if (left[i] == -1) ans[i] = right[i];
            else if (right[i] == -1) ans[i] = left[i];
            else{
                int temp1 = arr[Math.abs(i - left[i])]; //finding the absolute difference
                int temp2 = arr[Math.abs(i - right[i])]; // finding the absolute difference
                ans[i] = temp1 > temp2 ? right[i] : left[i];
            }
        }
        return ans;
    }
}
