package com.company;

import java.util.Scanner;
public class nick_hacker {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0;i<test;i++){
            double num = sc.nextDouble();
            if (hack(num)) System.out.println("Yes");
            else  System.out.println("No");
        }
    }
    public static boolean hack(double num){
        if (num==1) return true;
        if (num<10) return  false;
        return hack(num/20) || hack(num/10);
    }
}