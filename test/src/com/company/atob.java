package com.company;

import java.util.Scanner;

public class atob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            System.out.println(canBEPower(sc.nextInt(),sc.nextInt()));
        }
    }
    public static String canBEPower(int a,int b){
        return "NO";
    }
}
