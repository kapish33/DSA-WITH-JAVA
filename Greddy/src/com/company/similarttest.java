package com.company;

import java.util.*;

public class similarttest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(answer(sc.next(), sc.next()));
    }

    public static int answer(String sam1, String sam2) {
        int[][] dp = new int[sam1.length() + 1][sam2.length() + 1];
        for (int i = 1; i <= sam1.length(); i++) {
            for (int j = 1; j <= sam2.length(); j++) {
                if (sam1.charAt(i - 1) == sam2.charAt(j - 1)) dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[sam1.length()][sam2.length()];
    }
}
