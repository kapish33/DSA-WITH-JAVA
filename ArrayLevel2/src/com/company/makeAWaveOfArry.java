package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class makeAWaveOfArry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]= sc.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i < size; i+=2) {
            int temp = array[i];
            array[i]=array[i+1];
            array[i+1]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
