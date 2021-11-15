package com.company;

import java.util.Scanner;

public class count_occ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            int[] ans = new int[10];
            int size = sc.nextInt();
            int digit = sc.nextInt();
            while (digit>0){
                int rem =  digit%10;
                ans[rem]++;
                digit=digit/10;
            }
            for (int j = 0; j < 10; j++) {
                System.out.print(ans[9-j]+" ");
            }
            System.out.println();
        }
    }
}
