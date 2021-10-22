package com.company;

import java.util.Scanner;

public class sum_exist_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int[] array = new int[times];
        for (int i = 0; i < times; i++) array[i]= sc.nextInt();
        int tagret =  sc.nextInt();
        String ans = SubsetSum(array,times,tagret) ? "yes" : "no";
        System.out.println(ans);
    }
    public static boolean SubsetSum(int set[], int size, int target) {
        if (target == 0) return true;
        if (size == 0) return false;
        if (set[size - 1] > target) return SubsetSum(set, size - 1, target);
        return SubsetSum(set, size - 1, target) || SubsetSum(set, size - 1, target - set[size - 1]);
    }
}
