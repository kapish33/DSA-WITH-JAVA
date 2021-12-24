package com.company;

import java.util.Scanner;

public class language {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String sam = sc.next();
        char ch = sam.charAt(0);
        if (ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ) sam=sam+"hulk";
        else sam=sam+"thor";
        System.out.println(sam);
    }
}
