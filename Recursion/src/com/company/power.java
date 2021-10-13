package com.company;

public class power {
    public static void main(String[] args) {
        int n = 5,pow = 0;
        System.out.println(power(n,pow));
    }
    public  static int power(int n,int p){
        if (p==0) return 1;
        int xpm1 = power(n,p-1);
        int xm = n * xpm1;
        return xm;
    }
}
