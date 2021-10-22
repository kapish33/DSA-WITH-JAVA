package com.company;

import java.util.Scanner;

public class binary_equavalant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            System.out.println(binary(sc.nextInt()));
        }
    }
    public static String binary(int no){
        if (no == 0 || no ==1) return ""+no;
        return binary(no/2)+no%2;
    }
}
