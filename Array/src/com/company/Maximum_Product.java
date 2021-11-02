package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i]= sc.nextInt();
        System.out.println(maxProductDifference(array));
    }
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length-1;
        return ((nums[len-1]*nums[len])-(nums[0]*nums[1]));
    }
}
