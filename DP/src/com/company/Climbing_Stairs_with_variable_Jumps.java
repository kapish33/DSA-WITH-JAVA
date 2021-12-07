package com.company;

import java.util.Scanner;

public class Climbing_Stairs_with_variable_Jumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i]=sc.nextInt();
        int[] dp = new int[size+1];
        dp[size]=1;
        for (int i = size-1; i >=0 ; i--) {
            for (int j = 1; j < array[i] && i+j< dp.length; j++) {
                dp[i]+=dp[i+j];
            }
        }
        System.out.println(dp[0]);
    }
}
