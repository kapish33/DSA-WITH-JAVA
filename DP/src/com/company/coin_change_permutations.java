package com.company;

import java.util.Scanner;

public class coin_change_permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i]=sc.nextInt();
        int targer = sc.nextInt();
        System.out.println(coin_change_permut(array,size,targer,new int[targer+1]));
    }
    public static int coin_change_permut(int[] coins, int size, int target, int[] dp){
        dp[0]=1;
        for (int amt = 1; amt < target+1; amt++) {
            for (int coin:coins) {
                if (coin<=amt){
                    int rem = amt-coin;
                    dp[amt]+=dp[rem];
                }
            }
        }
        return dp[target];
    }
}
