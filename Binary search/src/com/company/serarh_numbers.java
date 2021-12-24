package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class serarh_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i]= sc.nextInt();
        Arrays.sort(array);

        int queries = sc.nextInt(); // 4
        for (int i = 0; i < queries; i++) {
            System.out.println(Math.abs(lowebound(array,sc.nextInt())-upper(array,sc.nextInt())));
        }
    }
    public static int lowebound(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while(low < high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] < target)
                low = mid + 1;
            else
                high = mid;
        }
        return nums[low] == target? low : -1;
    }

    public static int upper(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while(low < high) {
            int mid = low + (high+1 - low) / 2;
            if(nums[mid] > target)
                high = mid - 1;
            else
                low = mid;
        }
        return nums[low] == target? low : -1;
    }
}
