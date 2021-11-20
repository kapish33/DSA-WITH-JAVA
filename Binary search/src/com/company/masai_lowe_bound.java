package com.company;

import java.util.Scanner;

public class masai_lowe_bound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ta = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i]=sc.nextInt();
//        for (int i = 0; i < size; i++) System.out.print(array[i]+" ");
        System.out.println(lowebound(array,size,ta));
    }
    public static int lowebound(int[] digits,int size,int target){
        int low =0,high = size-1;
        while (low<high){
            int mid = (low + (high-low) / 2);
            if (digits[mid]==target) high=mid;
            else if (digits[mid]>target) high=mid;
            else if (digits[mid]<target) low=mid;
        }
        return high;
    }
}
