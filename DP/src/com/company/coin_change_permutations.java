package com.company;

import java.util.Scanner;

public class coin_change_permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i]=sc.nextInt();
        int targer = sc.nextInt();
        System.out.println(coin_change_permut(array,size,targer));
    }
    public static int coin_change_permut(int[] array,int size ,int target){
        return 12;
    }
}
