package com.company;

public class Find_Greatest_Common_Divisor_of_Array {
    public static void main(String[] args) {
        int[] aray = {2, 5, 6, 9, 10};
        System.out.println(findGCD(aray));
    }

    public static int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        for (int i = 0;i< nums.length;i++) {
            if (nums[i]<min) min=nums[i];
            if (nums[i]>max) max = nums[i];
        }
        return GCD(max,min);
    }
    public static int GCD(int a, int b){
        if(a==0) return b;
        return GCD(b%a, a);
    }
}
