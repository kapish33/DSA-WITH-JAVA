package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class party_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        5 3 24
//        6 4 21 20 13
        int size = sc.nextInt();
        int friends = sc.nextInt();
        int rupees = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i]= sc.nextInt();
        Arrays.sort(array);
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i]<rupees) {
                count++;
                rupees=rupees-array[i];
            }
        }
        if (count>=friends) System.out.println("Party");
        else System.out.println("Sad");
    }
}
