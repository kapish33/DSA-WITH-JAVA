package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Masai_packer_and_moview {
    static int count = 0;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int no_of_truck=  sc.nextInt();
        int[] truck = new int[no_of_truck];
        for (int i = 0; i < no_of_truck; i++) {
            truck[i]= sc.nextInt();
        }
        possibility(0,weight,truck);
        if (count==0) System.out.println(-1);
        else {
            System.out.println(max+" "+min);
        }

    }
    public static void possibility(int strat,int k,int[] array){
        Arrays.sort(array);

    }
}
