package com.company;

import java.util.Scanner;

public class CureIsPossible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] vaccines = new int[size];
        for (int i = 0; i < size; i++) {
            vaccines[i]= sc.nextInt();
        }
        boolean ans = true;
        for (int i = 0; i < size; i++) {
            if (vaccines[i]< sc.nextInt()) {
                ans= false;
            }
        }
        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
