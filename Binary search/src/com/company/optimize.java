package com.company;

import java.util.Scanner;

public class optimize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int ans = optimize(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            if (ans==0) System.out.println(-1);
            else System.out.println(ans);
        }
    }
    public static int optimize(int a, int b, int c, int k) {
        int min = 1000;
        if (k <= c) return 0;
        int h = k - c,l = 0;
        while (l <= h) {
            int mid = (l + h) / 2;
            if ((a * mid * mid) + (b * mid) > (k - c)) {
                min = Math.min(min, mid);
                h = mid - 1;
            }
            else if ((a * mid * mid) + (b * mid) < (k - c)) l = mid + 1;
            else return mid;
        }
        return min;
    }
}
