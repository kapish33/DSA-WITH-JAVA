package com.company;

import java.util.Scanner;

public class Minimum_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            int tar = sc.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) array[j]= sc.nextInt();
            System.out.println(minSumOfSLidingWindows(array,size,tar));
        }
    }
    public  static  int minSumOfSLidingWindows(int[] array,int size,int windows){
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < windows; i++) {
            sum +=array[i];
        }
        min=sum;
        for (int i = windows; i < size; i++) {
            sum = sum - array[i - windows] + array[i];
            min = Math.min(min, sum);
        }
        return min;
    }
}
