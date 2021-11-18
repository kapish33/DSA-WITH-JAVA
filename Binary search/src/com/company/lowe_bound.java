package com.company;

import java.util.Scanner;

public class lowe_bound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(),target = sc.nextInt();
        int[] array= new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println(lowe_bound_sear(array,size,target));
    };
    public static int lowe_bound_sear(int[] nums,int end,int target){
        if(nums[end-1]<target) return nums[end-1];
        if(nums[0]>target) return nums[0];

        int start = 0;
        while (start <= end) {
            int mid = (start + (end-start) / 2);
            if (nums[mid] == target) return nums[mid];
            else if (nums[mid] < target) {
                start = mid + 1;
            } else end = mid - 1;

        }
        return nums[end];
    }
}
