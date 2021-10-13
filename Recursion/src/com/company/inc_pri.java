package com.company;

public class inc_pri {
    public static void main(String[] args) {
        int num = 5;
        increasing_print(num);
    }
    public static void  increasing_print(int num){
        if (num == 0) return;
        increasing_print(num-1);
        System.out.println(num);
    }
}
