package com.company;

import java.util.Scanner;

public class friquency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            // take whole line as input in string buffer
            StringBuffer sb = new StringBuffer(sc.nextLine());
            // print it
            System.out.println(sb);
        }
    }
}

