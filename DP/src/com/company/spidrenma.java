package com.company;

import java.util.Scanner;

public class spidrenma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sized=sc.nextInt();
        int[] arr = new int[sized];
        for(int i=0;i<sized;i++)arr[i]=sc.nextInt();
        funct(arr,sized);
    }
    public  static int[] dp = new int[10000];

    public static void funct(int[] arr,int size){
        dp[size-1]=0;dp[size-2]=Math.abs(arr[size-1]-arr[size-2]);
        for(int i=size-3;i>=0;i--){
            int z = Math.abs(arr[i]-arr[i+2]);
            int y = Math.abs(arr[i]-arr[i+1]);
            dp[i]=Math.min(dp[i+1]+y,dp[i+2]+z);
        }
        System.out.println(dp[0]);
    }
}
