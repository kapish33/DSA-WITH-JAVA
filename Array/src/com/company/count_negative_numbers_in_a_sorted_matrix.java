package com.company;

public class count_negative_numbers_in_a_sorted_matrix {
    public static int countNegatives(int[][] grid) {
        int ans = 0;
        for (int[] g : grid) {
            int left = 0;
            int right = g.length - 1;
            while (left <= right) {
                int mid =left + (right - left) / 2;
                if (g[mid] >= 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            if (left < g.length) {
                ans += g.length - left;
            }
        }
        return ans;
    }
}
