package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class max_minSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            int last = sc.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) array[j] = sc.nextInt();
            Arrays.sort(array);
            System.out.println(difference(array,size,Math.abs(size-last)));
        }
    }
    public static int difference(int[] array,int size,int range){
        int asn = 0;
        for (int i = 0; i < range; i++) asn = asn + ( array[size-1-i] - array[i]);
        return asn;
    }
}
