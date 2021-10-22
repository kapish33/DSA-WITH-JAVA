package com.company;

import java.util.Scanner;

public class beyond_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%.4f",fact(sc.nextInt()));
    }
    public static double fact(int n){
        if (n ==0 ) return 1;
        return fact(n-1)+Math.log(n);
    }
}
