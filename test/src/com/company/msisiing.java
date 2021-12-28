package com.company;

import java.util.Scanner;

public class msisiing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int[] array = new int[10];
            for (int j = 0; j < 10; j++) array[j]=sc.nextInt();
//            for (int j = 0; j < 10; j++) System.out.print(array[j]);


            boolean[] checker = new boolean[12];
            System.out.println(firstMissing(array,checker));
        }
    }
    public static int firstMissing(int[] array,boolean[] checker){
        for (int i = 0; i < 10; i++) {
            checker[array[i]]=true;
        }
        for (int i = 0; i < 12; i++) {
            if (!checker[i]) {
                return i;
            }
        }
        return -1;
    }
}
