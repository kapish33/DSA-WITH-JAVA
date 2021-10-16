package com.company;

import java.util.Scanner;

public class taylor_series {
    static double power = 1,fact = 1;
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        System.out.format("%.4f",taylor(sc.nextInt(),sc.nextInt()));
    }
    public  static double taylor(int x,int n){
        double rezz;
        if (n==0) return 1;
        rezz = taylor(x,n-1);
        power = power * x;
        fact = fact *n;
        return (rezz +power /fact);
    }
}
