package com.company;


import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            System.out.println(gcd(sc.nextInt(), sc.nextInt()));
        }
    }
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);

    }
}