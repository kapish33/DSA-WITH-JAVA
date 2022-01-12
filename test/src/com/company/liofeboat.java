package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class liofeboat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size =  sc.nextInt();
            int k = sc.nextInt();
            int[] w = new int[size];
            for (int j = 0; j < size; j++) {
                w[j] = sc.nextInt();
            }
            // sort array
            Arrays.sort(w);
            System.out.println(minLifeboats(w,k));
        }
    }
    public static int minLifeboats(int[] w, int k) {
        int i = 0,j=w.length-1;
        int count = 0;
        while(i<=j) {
            if(w[i]+w[j]<=k) {
                i++;
                j--;
            } else {
                j--;
            }
            count++;
        }
        return count;

    }
}