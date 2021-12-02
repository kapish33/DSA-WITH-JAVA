package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class steal_as_much_as_you {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        50
        3
        60 100 120 -- price
        10 20 30 -- weight
         */
        int bag = sc.nextInt();
        int remaing = bag;
        int size = sc.nextInt();
        int[][] array = new int[size][3];
//        long [] ppw = new long[size];
        for (int i = 0; i < size; i++) array[i][0]= sc.nextInt();
        for (int i = 0; i < size; i++) array[i][1]= sc.nextInt();
        for (int i = 0; i < size; i++) array[i][2]=array[i][0]/array[i][1];// price per weight
        Arrays.sort(array,(a, b)->{
            return b[2]-a[2];
        });
        int ans = 0;
        for (int i = 0; i < size; i++) {
            if (bag>remaing){
                ans = (bag-(bag%array[i][2]));
            }
        }
        for (int i = 0; i < size; i++) System.out.print(array[i][0]+" "+array[i][1]+" ");

    }
    public static int steal(int[][] array,int bag,int size){
        return 1;
    }
}
