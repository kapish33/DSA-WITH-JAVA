package com.company;

import java.util.Scanner;
public class stock{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array1 = new int[7];
        int[] array2 = {550,240,84,159,80,160,252};
        int total = 0;
        for (int i=0;i<7;i++){
            array1[i] = sc.nextInt();
            total += (array1[i]*array2[i]);
        }
        System.out.println(n*total);
    }
}