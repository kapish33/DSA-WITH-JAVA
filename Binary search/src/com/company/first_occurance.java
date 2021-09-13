package com.company;

public class first_occurance {
    public static void main(String[] args) {
        int[] nums = {1,1,9,9,9};
        int target = 9;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + (end-start) / 2);
            if (nums[mid] == target) {
                ans= mid;
                end= mid-1;
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            } else end = mid - 1;

        }
        return ans;
    }
}
