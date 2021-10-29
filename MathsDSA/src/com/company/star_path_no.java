package com.company;

public class star_path_no {
    public int climbStairs(int n) {
        if (n <= 1) { // if value of n <= 1 then return 1, i.e. base cond^n
            return 1;
        }
        int dp[] = new int[n+1]; // create dp array of n+1 size
        dp[1] = 1; // for n = 1, answer = 1
        dp[2] = 2; // for n = 2, answer = 2
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1]+dp[i-2]; // For n = i, f(i) = f(i-1)+f(i-2)
        }
        return dp[n]; // return dp[n], containing answer
    }
}
