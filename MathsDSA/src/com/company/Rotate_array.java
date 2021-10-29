package com.company;

public class Rotate_array {
        public void rotate(int[] nums, int k) {
            k=k%nums.length;
            swap(nums,0,nums.length-1-k);
            swap(nums,nums.length-k,nums.length-1);
            swap(nums,0,nums.length-1);

        }
        public void swap(int[] nums,int lf,int rt){
            while(lf<rt){
                int temp=nums[lf];
                nums[lf]=nums[rt];
                nums[rt]=temp;
                lf++;
                rt--;
            }
        }
}
