package com.company;

public class decrease_pri {
    public static void main(String[] args) {
        decres_pr(10);
    }
    public static void decres_pr(int num){
        if (num==0) return;
        System.out.println(num);
        decres_pr(num-1);
    }
}
