package com.company;

import java.util.Scanner;

public class Masai_Packers_nad_Movers {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int no_of_truck=  sc.nextInt();
        int[] truck = new int[no_of_truck];
        for (int i = 0; i < no_of_truck; i++) {
            truck[i]= sc.nextInt();
        }
        possibility(0,weight,truck);
        System.out.println(count);

    }
    public static void possibility(int strat,int k,int[] array){
        if (strat==k) count++;
        if (strat>k) return ;
        for (int i = 0; i < array.length; i++) {
            possibility(strat+array[i],k,array);
        }
    }
}
