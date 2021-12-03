package com.company;

import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int fibo = Fibo(n);
//        long[] na = new long[6];
        long dpf = FibMemoized(n,new long[n+1]);
        System.out.println(dpf);
    }
    public static int Fibo(int n) {
        if (n == 0 || n == 1) return n;
        int fibn1 = Fibo(n - 1);
        int fibn2 = Fibo(n - 2);
        int fibn = fibn1 + fibn2;
        return fibn;
    }
    public static long FibMemoized(int n, long[] qb) {
        if (n == 0 || n == 1) return n;
        if (qb[n] != 0) return qb[n];
        long fibn1 = FibMemoized(n - 1, qb);
        long fibn2 = FibMemoized(n - 2, qb);
        long fibn = fibn1 + fibn2;
        qb[n] = fibn;
        return fibn;
    }
}
