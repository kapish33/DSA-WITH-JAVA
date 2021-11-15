package com.company;

import java.util.Scanner;

public class ways {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int stair = sc.nextInt();
            System.out.println(st_steps(stair));
        }
    }
    public static int st_steps(int n){
        if (n<0) return 0;
        if (n==0) return 1;
        return st_steps(n-1) + st_steps(n-2)+st_steps(n-5);
    }
}
