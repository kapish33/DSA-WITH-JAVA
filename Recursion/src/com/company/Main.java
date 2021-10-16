package com.company;

import java.util.Scanner;
import java.util.Stack;

class Main{
    static Stack<Integer> stack = new Stack<>();
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int t = 0; t < times; t++) {
            int size = sc.nextInt();
            int[] array = new int[size];

            for (int i = 0; i < size; i++) array[i] = sc.nextInt();


            int[] left = left(array,size);
            int[] right = right(array,size);
            int[] asn =  getAnswer(left,right);
//            for (int i = 0; i < size; i++) System.out.print(left[i]+" ");
//            System.out.println();
            for (int i = 0; i < size; i++) {
                if (asn[i]==-1) System.out.print(-1+" ");
                else System.out.print(array[asn[i]]+" ");
            };
            System.out.println();

        }
    }
    public static int[] left(int array[],int size){
        int left[] = new int[size];
        for (int i=0;i<array.length;i++){
            while(!stack.isEmpty() && array[stack.peek()] <= array[i]) stack.pop();
            if (stack.isEmpty()) left[i] = -1;
            else{
                left[i] = stack.peek();
            }
            stack.push(i);
        }
        return left;
    }


    public static int[] right(int array[],int size){
        int [] right = new int[size];
        stack = new Stack<>();
        for (int i=array.length-1;i>=0;i--){
            while(!stack.isEmpty() && array[stack.peek()] <= array[i]) stack.pop();
            if (stack.isEmpty()) right[i] = -1;
            else{
                right[i] = stack.peek();
            }
            stack.push(i);
        }
        return right;
    }
    public static int[] getAnswer(int left[], int right[]){
        int[] ans = new int[left.length];
        for (int i=0;i<left.length;i++){
            if (left[i] == -1 && right[i] == -1) ans[i] = -1;
            else if (left[i] == -1) ans[i] = right[i];
            else if (right[i] == -1) ans[i] = left[i];
            else{
                int temp1 = Math.abs(i - left[i]); //finding the absolute difference
                int temp2 = Math.abs(i - right[i]); // finding the absolute difference
                ans[i] = temp1 > temp2 ? right[i] : left[i];
            }
        }
        return ans;
    }
}