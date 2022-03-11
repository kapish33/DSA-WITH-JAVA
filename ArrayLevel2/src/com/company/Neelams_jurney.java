package com.company;

import java.util.Scanner;

public class Neelams_jurney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]= sc.nextInt();
        }
        System.out.println(MereJanNeelam(array));
    }
    public  static int MereJanNeelam(int[] array){
        int cost = 0;
        int micCost =1000000000;
        for (int i = 0; i < array.length; i++) {
            if (micCost > array[i] ) micCost = array[i];
            cost = cost + micCost;
        }
        return cost;
    }
}
