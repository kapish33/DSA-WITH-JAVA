package com.company;

import java.util.Scanner;

public class encrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            int size = sc.nextInt();
            String sam = sc.next();
            int toHack = 0;
            if (size%2==0) toHack = size/2;
            else toHack= size/2+1;
        }
    }
}
