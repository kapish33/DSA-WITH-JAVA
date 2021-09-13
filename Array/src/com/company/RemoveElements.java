package com.company;

public class RemoveElements {
    public int removeElement(int[] nums, int val) {
        int i = nums.length - 1;
        while (i >= 0 && nums[i] == val)
            i--;

        for (int j = i - 1; j >= 0; j--) {
            if (nums[j] == val) {
                nums[j] = nums[i--];
            }
        }
        return i + 1;
    }
}
