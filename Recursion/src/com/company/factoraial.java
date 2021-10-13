package com.company;

import java.util.Scanner;

public class factoraial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(ans(sc.nextInt()));
    }
    public static int ans(int n){
        if (n < 1) return 1;
        return n*ans(n-1);
    }
}
