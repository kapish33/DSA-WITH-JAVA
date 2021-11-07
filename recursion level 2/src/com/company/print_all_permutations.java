package com.company;

import java.util.Scanner;

public class print_all_permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nboxex = sc.nextInt();
        int ritems = sc.nextInt();
        permutations(new int[nboxex],1,ritems);
    }
    public static void permutations(int[] boxex, int start ,int end){
        if (start>end){
            for (int i = 0; i < boxex.length; i++) {
                System.out.print(boxex[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < boxex.length; i++) {
            if (boxex[i]==0){
                boxex[i]=start;
                permutations(boxex, start + 1, end);
                boxex[i]=0;
            }
        }
    }
}
