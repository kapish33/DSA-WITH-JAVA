package com.company;

public class sum_of_all_subsets {
    public static void main(String[] args) {
        System.out.println(subsetXOR);
    }
    int sum = 0;

    public  int subsetXORSum(int[] nums) {
        findSum(nums, 0, 0);
        return sum;
    }

    void  findSum(int[] nums, int index, int currentSum) {
        sum += currentSum;

        for (int i = index; i < nums.length; i++) {
            currentSum ^= nums[i];
            findSum(nums, i + 1, currentSum);
            currentSum ^= nums[i];
        }

    }
}
