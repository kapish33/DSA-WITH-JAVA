package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class hostel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        for (int i = 0; i < size; i++) array1[i]= sc.nextInt();
        for (int i = 0; i < size; i++) array2[i]= sc.nextInt();
        Arrays.sort(array1);
        Arrays.sort(array2);
        int max =-100;
        for (int i = 0; i < size; i++) {
            if (Math.abs(array1[i]-array2[i])>max) max=Math.abs(array1[i]-array2[i]);
        }
        System.out.print(max);
    }
}
