package com.company;

public class increasing {
    public static void main(String[] args) {
        int num = 5;
        increase(num+1,1);
    }
    public static void increase(int n,int new_n){
        if (n==new_n) return;
        //
        System.out.println(new_n); // 1 2 3 4
        increase(n,new_n=new_n+1); // base case
        System.out.println(new_n-1);// 4 3 2 1
    }
}
