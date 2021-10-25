package com.company;

import java.util.Scanner;

public class Oddsubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]= sc.nextInt();
        }
        System.out.println(evenSubarray(array,size));
    }
    public static int evenSubarray(int[] array,int size) {
        int c1 = 0, c2 = 1, n = size;
        int currSum = 0;
        long ans = 0;
        int mod = (int)Math.pow(10, 9) + 7;
        for(int i = 0; i < n; i++) {
            currSum += array[i];
            if(currSum % 2 == 0) {
                ans = (ans + c1) % mod;
                c2++;
            } else {
                ans = (ans + c2) % mod;
                c1++;
            }
        }
        return (int)ans;
    }
}
