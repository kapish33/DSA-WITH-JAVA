package com.company;

import java.util.Scanner;

public class powerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(ways(sc.nextInt(),sc.nextInt(),1,0));
    }

    static int ways(int x, int n, int totalSum, int sum) {
        int results = 0;
        int p = power(totalSum, n);
        while (p + sum < x) {
            results += ways(x, n, totalSum + 1, p + sum);
            totalSum++;
            p = power(totalSum, n);
        }
        if (p + sum == x) results++;
        return results;
    }
    public static int power(int num, int n) {
        if (n == 0) return 1;
        else if (n % 2 == 0) return power(num, n / 2) * power(num, n / 2);
        else return num * power(num, n / 2) * power(num, n / 2);
    }
}
