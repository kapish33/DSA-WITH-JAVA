package com.company;

public class factoraial {
    public static void main(String[] args) {
        int no  = 1;
        System.out.println(ans(no));
    }
    public static int ans(int n){
        if (n < 1) return 1;
        return n*ans(n-1);
    }
}
