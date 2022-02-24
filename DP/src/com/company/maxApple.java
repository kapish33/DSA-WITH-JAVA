package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class maxApple {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int bucket = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0;i < size;i++) array[i] = sc.nextInt();
        Arrays.sort(array);
        System.out.println(maxApple(array,bucket));
    }
    public static int maxApple(int[] arr,int w) {  
        int count=0;
        for (int j : arr) {
            if (j > w) break;
            w -= j;
            count++;
        }
        return count;
    }
}
