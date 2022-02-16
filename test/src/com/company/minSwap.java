package com.company;

import java.util.Scanner;

public class minSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int size = sc.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) {
                array[j]= sc.nextInt();
            }
            System.out.println(minSwaps(array,size));
        }
    }
    public static int minSwaps(int[] arr, int n) {
        int totalCount = 0,i;
        for(i = 0; i < n; i++) totalCount += arr[i];
        int currCount = 0;
        int maxCount = 0;
        i = 0;
        int j = 0;
        while (j < n) {
            currCount += arr[j];
            if ((j - i + 1) == totalCount) {
                maxCount = Math.max(maxCount, currCount);
                if (arr[i] == 1) currCount--;
                i++;
            }
            j++;
        }
        return totalCount - maxCount;
    }
}
