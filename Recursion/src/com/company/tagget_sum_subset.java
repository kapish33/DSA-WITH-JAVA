package com.company;

import java.util.Scanner;

public class tagget_sum_subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size_of_array  = sc.nextInt();
        int[] array = new int[size_of_array];
        for (int i = 0; i < size_of_array; i++) array[i]= sc.nextInt();
        int target = sc.nextInt();
        PrintTargetSubset(array,0,"",0,target);
    }
    public static void PrintTargetSubset(int[] array,int index,String set ,int sum_of_subset,int target){
        if (index==array.length) {
            if (target==sum_of_subset){
                System.out.println(set);
                return;
            }else {
                return;
            }
        }
        PrintTargetSubset(array, index+1, set+array[index]+" , ", sum_of_subset+array[index], target);
        PrintTargetSubset(array, index+1, set, sum_of_subset, target);
    }
}
