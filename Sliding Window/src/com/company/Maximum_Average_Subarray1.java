package com.company;

public class Maximum_Average_Subarray1 {
    public static void main(String[] args) {
        int[] array = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(array,k));
    }
    public static double findMaxAverage(int[] nums, int k) {
//        making array sum for answer
        int sum = 0;
        for (int i = 0;i<k;i++) sum=nums[i]+sum;
//        now lets et mazimum of sum
        int temp = sum;
        for (int i=k;i< nums.length;i++) {
            temp=temp+nums[i]-nums[i-k];
            sum=Math.max(temp,sum);
        }
        return sum*1.0/k;
    }
}
