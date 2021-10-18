package com.company;

import java.util.Scanner;

public class profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), r= sc.nextInt();
        System.out.printf("%.4f",1+profitandLoss(n,r,1));
    }
    public static double profitandLoss(int r,int n ,int c){
        if (c>n) return 0;
        else {
            double tempraty = 1/Math.pow(r,c);
            return tempraty+profitandLoss(r, n, c+1);
        }
    }
}
