package com.company;

import java.util.Scanner;

public class Longest_Increasing_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) array[j]= sc.nextInt();
            System.out.println(longIncreasingSubarray(array,size));
        }
    }
    public static int longIncreasingSubarray(int[] array,int size){
        int max = 0;
        for (int i = 0; i < size; i++) {
            int count = 1;
            for (int j = i+1; j < size; j++) {
                if (array[j]>array[j-1]){
                    count++;
                }
                else break;
            }
            if (count>max) max = count;
        }
        return max;
    }
}
