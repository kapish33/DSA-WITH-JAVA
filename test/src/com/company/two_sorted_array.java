package com.company;

import java.util.Scanner;

public class two_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t=0;t<test;t++){
            int size = sc.nextInt();
            int[] array1 = new int[size];
            int[] array2 = new int[size];
            for (int i = 0;i<size;i++) array1[i]= sc.nextInt();
            for (int i = 0;i<size;i++) array2[i]= sc.nextInt();
            System.out.println(coomon(array1,array2,size));
        }
    }
    public static int coomon(int[] arr1,int[]arr2,int size){
        int left = 0,right = size-1,count = 0;
        while(left < size && right >= 0){
            if (arr1[left] - arr2[right]<0) left++;
            else if (arr1[left] > arr2[right]) right--;
            else{
                count++;
                left++;
                right--;
            }
        }
        return  count;
    }
}
