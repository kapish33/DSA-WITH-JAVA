package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class angry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i]= sc.nextInt();
        System.out.println(min_anger(array,size));
    }
    public static int min_anger(int[] array,int size){
        Arrays.sort(array);
        int sum = 0, max =0;
        for (int i = 2; i < size-2; i++) {
            sum=array[i]-array[i-2];
            if (sum > max ) max =sum;
        }
        sum=array[1]-array[0];
        if (sum>max) max =sum;
        sum = array[size-1]-array[size-2];
        if (sum>max) max =sum;
        sum = array[size-1]-array[size-3];
        if (sum>max) max =sum;
        return max;
    }
}
