package com.company;

import java.util.Scanner;

public class cordinate {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int size = sc.nextInt();
        String sam = sc.next();
        int x = 0,y=0;
        for (int i = 0; i < size; i++) {
            if (sam.charAt(i)=='u') x++;
            if (sam.charAt(i)=='d') x--;
            if (sam.charAt(i)=='r') y++;
            if (sam.charAt(i)=='l') y--;
        }
        System.out.println(x+" "+y);
    }
}
