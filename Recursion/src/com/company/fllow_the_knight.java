package com.company;

import java.util.Scanner;

public class fllow_the_knight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),r = sc.nextInt(),c = sc.nextInt();
        int[][] chess = new int[n][n];
        System.out.println(printKnightToor(chess,r,c));
    }
    public static int printKnightToor(int[][] chess,int r,int c){
        return 8;
    }
}
