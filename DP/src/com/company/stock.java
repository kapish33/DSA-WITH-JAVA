package com.company;

import java.util.Scanner;

public class stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) array[j]= sc.nextInt();
            System.out.println(stock(array,size));
        }
    }
    public static int stock(int[] array,int size){
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (array[i]<min){
                min= array[i];
                int temp = min-array[i];
                if (temp>max) max = temp;
            }else {
                int temp = array[i]-min;
                if (temp>max) max = temp;
            }
        }
        return max;
    }
}
