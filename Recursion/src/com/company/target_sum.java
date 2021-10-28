package com.company;

import java.util.Arrays;

public class target_sum {
     public int findTargetSumWays(int[] nums, int target) {
            int sum = 0, n = nums.length;
            for (int ele : nums) sum += ele;
            if (target > sum || target < -sum) return 0;

            int[][] dp = new int[n + 1][2 * sum + 1];
            for (int[] d : dp) Arrays.fill(d, -1);
            return findTarget(nums, n, sum, sum + target, dp);
        }
        public int findTarget(int[] nums,int n,int sum, int tar,int[][]dp) {
            if(n==0) return dp[n][sum] = tar == sum ? 1 : 0;
            if(dp[n][sum]!=-1) return dp[n][sum];
            int count=0;
            count+=findTarget(nums,n-1,sum+nums[n-1],tar,dp);
            count+=findTarget(nums,n-1,sum-nums[n-1],tar,dp);

            return dp[n][sum]=count;
    }
}
