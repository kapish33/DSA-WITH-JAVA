package com.company;

import java.util.Scanner;

public class Sum_with_Recursion_Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times  = sc.nextInt();
        for (int t = 0;t<times;t++){
            int size = sc.nextInt();
            int[] array = new int[size];
            // 1 5 2 --> 7
            for (int i = 0;i<size;i++) array[i]= sc.nextInt();
            System.out.println(maxDiff(array,size,0));
        }
    }
    public static int maxDiff(int[] arr,int size,int ans){
        if (size==1) return ans;
        ans = maxDiff(arr, size-1,ans)+Math.abs(arr[size-1]-arr[size-2]);
        return ans;
    }
}
