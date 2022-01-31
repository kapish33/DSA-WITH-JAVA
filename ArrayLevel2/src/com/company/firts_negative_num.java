package com.company;


import java.util.Scanner;

public class firts_negative_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases  = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int size = sc.nextInt();
            int windowSize = sc.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) {
                array[j]= sc.nextInt();
            }
            firstNeg(array,size,windowSize);
        }
    }
    static void firstNeg(int array[], int size, int windowSize) {
        boolean flag;
        for (int start = 0; start<(size-windowSize+1); start++) {
            flag = false;
            for (int i = 0; i<windowSize; i++) {
                if (array[start+i] < 0) {
                    flag = true;
                    System.out.print((array[start+i])+" ");
                    break;
                }
            }
            if (!flag)  System.out.print("0"+" ");
        }
    }
}
