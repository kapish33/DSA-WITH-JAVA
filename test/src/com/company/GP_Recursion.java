package com.company;

import java.util.Scanner;

public class GP_Recursion {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0;i<test;i++) {
            count++;
            int n = sc.nextInt();
            function(4,n);
            function(8,n);
        }
    }
    public static void function(int num,int val){
        if (num>val) return;
        else if (num ==val) count++;
        function(num+4,val);
        function(num+8,val);
    }
}
