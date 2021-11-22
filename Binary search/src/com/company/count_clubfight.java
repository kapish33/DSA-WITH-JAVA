package com.company;

import java.util.Scanner;

public class count_clubfight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] powers = new int[N];
        for (int i = 0; i < N; i++) powers[i]=sc.nextInt();
        // binary serach
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int pow=sc.nextInt();
            int num =0,po =0;
            for (int j = 0; j < N; j++) {
                if (powers[j]<=pow) {
                    num++;
                    po+=powers[j];
                }
            }
            System.out.println(num+" "+po);
        }
    }
}
