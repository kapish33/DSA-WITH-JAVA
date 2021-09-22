package com.company;

public class Decompress_Run_Length_Encoded_List {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = decompressRLElist(nums);
        for (int i= 0;i< ans.length;i++) System.out.print(ans[i]+" ");
    }
    public static int[] decompressRLElist(int[] nums) {
        int freq = 0;
        for (int i=0;i< nums.length;i=i+2) freq=freq+nums[i];
        int[] ans = new int[freq];
        int track= 0;

        for (int i =1;i< nums.length;i=i+2){
            int value= nums[i];
            for (int j = 0;j<nums[i-1];j++){
                ans[track++]=value;
            }
        }return ans;
    }
}
