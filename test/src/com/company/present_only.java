package com.company;

import java.util.Scanner;

public class present_only {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = 2*sc.nextInt()-1;// for 5 it's 9
            int[] array = new int[size];
            for (int j = 0; j < size; j++) {
                array[j]= sc.nextInt();
            }
            System.out.println(OnlyOne(size,array));
        }
    }
    public static int OnlyOne(int size,int[] array){
        int ans  = -1;
        for (int i = 0; i < size; i++) {
            ans = array[i]^ans;
        }
        return ~ans;
    }
}
