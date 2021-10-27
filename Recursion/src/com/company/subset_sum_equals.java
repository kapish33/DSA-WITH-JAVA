package com.company;

import java.util.Scanner;

public class subset_sum_equals {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        targetSumSubset(array, 0, "", 0, target);
        System.out.println(count);
    }

    public static void targetSumSubset(int[] arr, int ind, String set, int sos, int tar) {
        if (ind == arr.length) {
            if (sos == tar) {
                count++;
//                System.out.println(set+".");

                return;
            }

            targetSumSubset(arr, ind + 1, set + arr[ind], sos + arr[ind], tar);
            targetSumSubset(arr, ind + 1, set, sos, tar);
        }
    }
}