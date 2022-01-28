package com.company;

import java.util.Scanner;

public class MasaiAir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        boolean[] arr = new boolean[size];
        for (int i = 0; i < size; i++) {
            if (sc.nextInt()<=15) arr[i]=true;
        }
        for (int i = 0; i < size; i++) {
            if (arr[i]==true && sc.nextInt()<=7){
                System.out.println("Board");
            }else {
                System.out.println("Stop");
            }
        }
    }
}
