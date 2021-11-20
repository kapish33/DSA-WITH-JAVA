package com.company;

import java.util.Scanner;

public class ocurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int count =0;
        for (int i = 0; i < size; i++) {
            if (sc.nextInt()==target) count++;
        }
        System.out.println(count);
    }
}
