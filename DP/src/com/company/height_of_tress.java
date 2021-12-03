package com.company;

import java.util.Scanner;

public class height_of_tress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int omax = 0;
        int[] dp = new int[size];
        for(int i = 0; i < size; i++){
            Integer max = null;
            for(int j = 0; j < i; j++){
                if(arr[j] < arr[i]){
                    if(max == null || dp[j] > max){
                        max = dp[j];
                    }
                }
            }
            if(max != null)dp[i] = max + 1;
            else dp[i] = 1;
            if(dp[i] > omax) omax = dp[i];
        }
        System.out.println(omax);
    }
}
