package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class array_partition {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] array = {1,3,4,2};
        System.out.println(arrayPairSum(array));
    }
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for (int i = 0; i < nums.length; i+=2) ans+=nums[i];
        return ans;
    }
}
