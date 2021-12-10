package com.company;

import java.util.Scanner;

public class hosue_robber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,12,3,1};
        System.out.println(steal(array,array.length,0,new int[array.length+1]));
        System.out.println(rob(array, array.length));
    }
    public static int steal(int[] array,int size,int start,int[] dp){
        if (start>=size) return 0;
        // steal
        if (dp[start]!=0) return dp[start];
        int ste = array[start]+steal(array, size, start+2,dp);
        // not steal
        int notSteal = steal(array, size, start+1,dp);
        dp[start] = Math.max(ste,notSteal);
        return dp[start];
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
    public static int pureItr(int[] array,int size){
        int iplus1 = 0;
        int iplus2 = 0;
        for (int i = size-1; i >=0 ; i--) {
            int current = array[i]+iplus2;
            current = Math.max(current,iplus1);
            iplus2 =iplus1;
            iplus1= current;
        }
        return iplus1;
    }
}
