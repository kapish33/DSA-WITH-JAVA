package com.company;

import java.util.Scanner;

public class array_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int t = 0;t<times;t++){
            int size = sc.nextInt();
            int[] array = new int[size];
            for (int i = 0;i<size;i++) array[i]= sc.nextInt();
            System.out.println(sum(array,size-1));
        }
    }
    public static int sum(int[] array,int size){
        if (size == 0) return array[0];
        else return sum(array,size-1) + array[size];
    }
}
