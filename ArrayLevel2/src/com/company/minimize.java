package com.company;

import java.util.Scanner;

public class minimize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int leng = sc.nextInt();
            int[] array = new int[leng];
            for (int j = 0; j < leng; j++) array[j]= sc.nextInt();
        }
    }
}
