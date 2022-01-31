package com.company;

import java.util.Scanner;

public class nthroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int a  = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(nthroot(a,c));
        }
    }
    public static int nthroot(int a, int c) {
        // Write your code here
        // a ^ b = c; b=log(c)/log(a);
        int b = (int) ((int) Math.log(c)/Math.log(a));
        return (int) Math.pow(a,b);
    }
}
