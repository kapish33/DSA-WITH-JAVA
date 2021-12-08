package com.company;

import java.util.Scanner;

public class spring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int f = 0; f < test; f++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int[][] array = new int[i][j];
            for (int k = 0; k < i; k++) {
                for (int l = 0; l < j; l++) {
                    array[k][l]=sc.nextInt();
                }
            }
            System.out.println(maximixe(array));
        }


    }
    public static int maximixe(int[][]arr){
        int[][] dp = new int[arr.length][arr[0].length];
        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = arr[0].length - 1; j >= 0; j--){
                if(i == arr.length - 1 && j == arr[0].length - 1){
                    dp[i][j] = arr[i][j];
                } else if(i == arr.length - 1){
                    dp[i][j] = arr[i][j] + dp[i][j + 1];
                } else if(j == arr[0].length - 1){
                    dp[i][j] = arr[i][j] + dp[i + 1][j];
                } else {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }

        return dp[0][0];
    }
}
