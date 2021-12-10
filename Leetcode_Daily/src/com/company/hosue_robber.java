package com.company;

import java.util.Scanner;

public class hosue_robber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,1};
        System.out.println(steal(array,array.length-1,0,new int[array.length+1]));
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
}
