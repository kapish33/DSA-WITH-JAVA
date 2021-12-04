package com.company;

import java.util.Scanner;

public class sumexist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]= sc.nextInt();
        }
        boolean ans = isSum(array, size, sc.nextInt());
        if (ans) System.out.println("yes");
        else System.out.println("no");
    }
    static boolean isSum(int array[], int n, int sum) {
        if (sum == 0) return true;
        if (n == 0) return false;
        if (array[n - 1] > sum) return isSum(array, n - 1, sum);
        return   isSum(array, n - 1, sum - array[n - 1]) || isSum(array, n - 1, sum);
    }
}
