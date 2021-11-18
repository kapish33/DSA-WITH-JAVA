package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Discover_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int queries = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]= sc.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i < queries; i++) {
            int target = sc.nextInt();
            System.out.println(search(array,target));
        }
    }
    public static String search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + (end-start) / 2);
            if (nums[mid] == target) return "YES";
            else if (nums[mid] < target) {
                start = mid + 1;
            } else end = mid - 1;
        }
        return "NO";
    }
}
