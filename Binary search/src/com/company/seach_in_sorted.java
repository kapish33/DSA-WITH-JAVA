package com.company;

import java.util.Scanner;

public class seach_in_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int tar = sc.nextInt();
        int[] array  = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]= sc.nextInt();
        }
        System.out.println(search(array,tar));
    }
    public  static int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;
        while( left <= right ) {
            int mid = (left + right) / 2;
            if( nums[mid] == target ) return mid;
            if( target > nums[mid] ) {
                if( nums[mid] <= nums[right] && target > nums[right] ) right = mid - 1;
                else left = mid + 1;
            } else {
                if( target < nums[left] && nums[mid] >= nums[left]) left = mid + 1;
                else right = mid -1;
            }
        }
        return -1;
    }

}
