package com.company;

import java.util.Scanner;

public class count_occ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            int[] ans = new int[10];
            int size = sc.nextInt();
            String digit = sc.next();
            // frequencey array
            for (int j = 0; j < size; j++) {
                int j = digit.charAt(j)-'0'; //21321
                ans[digit.charAt(j)-'0']=ans[digit.charAt(j)-'1']+1;
            }
            for (int j = 0; j < 10; j++) {
                System.out.print(ans[9-j]+" ");
            }
        }
    }
}
