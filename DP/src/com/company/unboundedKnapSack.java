package com.company;

import java.util.Scanner;

public class unboundedKnapSack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] vals = new int[size];
        for (int i = 0; i < size; i++) vals[i]= sc.nextInt();
        int[] weights = new int[size];
        for (int i = 0; i < size; i++) weights[i]= sc.nextInt();
        int capacity = sc.nextInt();
        int[] dp = new int[capacity+1];
        dp[0]=0;
        System.out.println(ubns(vals,weights,size,capacity,dp));
    }
    public static int ubns(int[] vals,int[] weights,int size,int capacity,int[] dp){
        for (int cap = 0; cap <= capacity; cap++) {
            int max=0;
            for (int i = 0; i < size; i++) {
                if (weights[i]<=cap){
                    int rbcap = cap-weights[i];
                    int rbagv = dp[rbcap];
                    int tbagv = rbagv + vals[i];
                    if (tbagv>max) max=tbagv;
                }
            }
            dp[cap]=max;
        }
        return dp[capacity];
    }
}
