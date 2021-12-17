package com.company;

import java.util.Scanner;

public class napsackDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =5;// sc.nextInt();
        int[] weight = {2,5,1,3,4};//new int[size];
        int[] val = {15,14,10,45,30};//new int[size];
        int capacity =7;// sc.nextInt();
        int[][] dp = new int[size+1][capacity+1];
        System.out.println(zeroOneNapSac(weight,val,capacity,size,dp));
    }
    public static int zeroOneNapSac(int[] weight,int[] items,int cap,int size,int[][] dp){
        for (int i = 1; i < size+1; i++) {
            for(int j = 1; j < cap+1; j++){
                int val = items[i - 1];
                int wt = weight[i - 1];
                dp[i][j]= j>=wt ? Math.max(dp[i - 1][j], dp[i - 1][j - wt] + val) :dp[i - 1][j];
            }
        }
        return dp[size][cap];
    }
}
