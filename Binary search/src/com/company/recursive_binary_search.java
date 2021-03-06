package com.company;

import java.util.Scanner;

public class recursive_binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i]= sc.nextInt();
        System.out.println(binarySearch(array,0, size-1,target));
    }
    public static int binarySearch(int[] nums, int left, int right, int target) {
        if (left > right) return -1;
        int mid = (left + right) / 2;
        if (target == nums[mid]) return 1;
        else if (target < nums[mid]) return binarySearch(nums, left, mid - 1, target);
        else return binarySearch(nums, mid + 1, right, target);
    }
}
//https://www.desmos.com/calculator/daocnxt46b