package com.company;

import java.util.Scanner;

public class robber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) array[j]= sc.nextInt();
//            for (int j = 0; j < size; j++) System.out.println(array[j]);
            System.out.println(rob(array,size));
        }
    }
    public static int rob(int[] array,int size){
        int[] dp = new int[size+2];
        dp[size]=0;
        dp[size+1]=0;
        for (int i = size-1; i >=0; i--) {
            dp[i]=array[i] +dp[i+2];
            dp[i]=Math.max(dp[i],dp[i+1]);
        }
        return dp[0];
    }
}
