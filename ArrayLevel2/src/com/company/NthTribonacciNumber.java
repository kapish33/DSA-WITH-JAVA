package com.company;

import java.util.Scanner;

public class NthTribonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int term = sc.nextInt();
            System.out.println(Tibo(term,new long[term+1]));
        }
    }
    public static  long Tibo(int n,long[] dp) {
        if (n == 0) return 0;
        if (n == 1 ) return 1;
        if (n == 2 )return 1;
        if (dp[n]!=0) return dp[n];
        dp[n] = Tibo(n-1,dp)+Tibo(n-2,dp)+Tibo(n-3,dp);
        return dp[n];
    }
}
