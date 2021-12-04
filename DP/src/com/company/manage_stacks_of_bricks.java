package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class manage_stacks_of_bricks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            int increase = sc.nextInt();
            int decrese = sc.nextInt();
            int[] array1 = new int[size];
            int[] array2 = new int[size];
            for (int j = 0; j < size; j++) {
                array1[j]=sc.nextInt();
                array2[j]=sc.nextInt();
            }

            Arrays.sort(array1);
            Arrays.sort(array2);
            for (int j = 0; j < size; j++) {
                System.out.println(array1[j]+" "+array2[j]);

            }
            int minimizeSum = 0;
            for (int j = 0; j < size; j++) {
                if(array1[j]>array2[j]) {
                    minimizeSum += (array1[j]-array2[j])*decrese;
                }
                else {
                    minimizeSum += (array2[j]-array1[j])*increase;
                }
            }
            System.out.println(minimizeSum);
        }
    }
}
