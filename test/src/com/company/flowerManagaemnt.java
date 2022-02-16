package com.company;

import java.util.Scanner;

public class flowerManagaemnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int size = sc.nextInt();
            int flowers = sc.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) {
                array[j]= sc.nextInt();
            }
            int pass = 0;
            for (int j = 0; j < size-3; j++) {
                if (array[j]==0 && array[j+1]==0 && array[j+2]==0) pass++;
            }
            if (pass>=flowers) System.out.println("Yes");
            else System.out.println("No");
//            System.out.println(pass);
        }
    }
}
