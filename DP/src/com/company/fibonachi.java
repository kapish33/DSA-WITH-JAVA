package com.company;

import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fibo = Fibo(n);
        int dpf = FibMemoized(n,new int[n+1]);
        System.out.println(dpf);
    }
    public static int Fibo(int n) {
        if (n == 0 || n == 1) return n;
        int fibn1 = Fibo(n - 1);
        int fibn2 = Fibo(n - 2);
        int fibn = fibn1 + fibn2;
        return fibn;
    }
    public static int FibMemoized(int n, int[] qb) {
        if (n == 0 || n == 1) return n;
        if (qb[n] != 0) return qb[n];
        int fibn1 = FibMemoized(n - 1, qb);
        int fibn2 = FibMemoized(n - 2, qb);
        int fibn = fibn1 + fibn2;
        qb[n] = fibn;
        return fibn;
    }
}
