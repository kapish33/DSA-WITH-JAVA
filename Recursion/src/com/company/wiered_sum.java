package com.company;

import java.util.Scanner;

public class wiered_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) array[j]= sc.nextInt();
            int traget = -1;
            for (int j = 0; j < size; j++) if (traget<array[j]) traget=array[j];

            if (isSubsetSum(array,size,traget)) System.out.println("Yes");
            else System.out.println("No");

        }
    }
    public static boolean isSubsetSum(int set[], int n, int sum) {
        if (sum == 0) return true;
        if (n == 0) return false;
        if (set[n - 1] > sum) return isSubsetSum(set, n - 1, sum);
        return isSubsetSum(set, n - 1, sum) || isSubsetSum(set, n - 1, sum - set[n - 1]);
    }
}
