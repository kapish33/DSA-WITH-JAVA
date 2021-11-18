package com.company;

import java.util.Scanner;

public class bainary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int target = sc.nextInt();
        for (int i = 0; i < size; i++) array[i]= sc.nextInt();
        System.out.println(search(array,target));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + (end-start) / 2);
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) {
                start = mid + 1;
            } else end = mid - 1;
        }
        return -1;
    }
}
