package com.company;

import java.util.Scanner;

public class All_Twice_Except_One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            int size = sc.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) array[j]=sc.nextInt();
            System.out.println(unique(array,size));
        }
    }
    public static int unique(int[] array,int size){
        int ans = -1;
        for (int i = 0; i < size; i++) {
            ans=ans^array[i];
        }
        return ans^-1;
    }
}
