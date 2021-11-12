package com.company;

public class Next_permutation {
    class Solution {
        public void nextPermutation(int[] nums) {
            if(nums.length==1){
                return;
            }
            int i=nums.length-2;
            //find index where nums[i]<nums[i+1]
            while(i>=0 && nums[i]>=nums[i+1]) i--;

            if(i>=0){   // If not entirely descending ex: [3,2,1]
                int j=nums.length-1; // Start from the end
                while(nums[i]>=nums[j]) j--;//find index where nums[i]<nums[j]

                swap(nums, i,j);
            }
            //sort  the array in ascending order after the swapped element
            //i.e. Reverse the descending sequence
            reverse(nums, i+1, nums.length-1);
        }
        void swap(int []nums, int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

        void reverse(int[] nums,int i, int j){
            //reversing is just swapping first and last elements since the array will be in decreasing order
            while(i<j){
                swap(nums, i++,j--);
            }
        }
    }
}
