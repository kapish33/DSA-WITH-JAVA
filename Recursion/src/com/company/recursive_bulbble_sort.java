package com.company;

import java.util.Scanner;

public class recursive_bulbble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i]= sc.nextInt();
        bubbleSort(array,size);
        for (int i = 0; i < size; i++) System.out.print(array[i]+" ");
    }
    public static void bubbleSort(int array[], int size) {
        if (size == 1) return;
        for (int i=0; i<size-1; i++)
            if (array[i] > array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        bubbleSort(array, size-1);
    }
}
