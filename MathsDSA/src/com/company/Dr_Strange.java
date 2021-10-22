package com.company;

import java.util.Scanner;

public class Dr_Strange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder myString = new StringBuilder();
        int len =  sc.nextInt();
        for (int i = 1;i<=len;i++) myString.append(i);
        Dr_strange(myString.toString(),len,-1,"");

    }
    static void Dr_strange(String str, int n, int index, String curr) {
        if (index == n) return;
        for (int i = 0; i < curr.length(); i++) {
            if (i!=0 && curr.charAt(i)=='1') System.out.print(curr.charAt(i)+"0"+" ");
            else System.out.print(curr.charAt(i)+" ");
        }
        System.out.println();
        for (int i = index + 1; i < n; i++) {
            curr += str.charAt(i);
            Dr_strange(str, n, i, curr);
            curr = curr.substring(0, curr.length() - 1);
        }
    }
}
