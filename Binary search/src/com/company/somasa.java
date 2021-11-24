package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class somasa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int rupees = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i]= sc.nextInt();
        Arrays.sort(array);
        int somasa =0;
        for (int i = 0; i < size; i++) {
            if (rupees>=array[i]){
                somasa++;
                rupees=rupees-array[i];
            }
        }
        System.out.println(somasa);
    }
}
