package com.company;

import java.util.Scanner;

public class Alternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            if (i%2==0) sum+=num;
        }
        System.out.println(sum);

    }
}
