package com.company;

import java.util.Scanner;

public class napsackDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =5;// sc.nextInt();
        int[] weight = {1,2,3,2,2};//new int[size];
        int[] items = {8,4,0,5,34};//new int[size];
        int capacity =4;// sc.nextInt();
        System.out.println(zeroOneNapSac(items,weight,capacity,size));
    }
    public static int zeroOneNapSac(int[] weight,int[] value,int cap,int size){
        if (size==0 || cap ==0) return 0;
        if (value[size-1]<=cap){
            return Math.max(value[size-1],Math.max(zeroOneNapSac(weight, value, cap-weight[size-1], size-1),zeroOneNapSac(weight, value, cap, size-1)) );
        }
        return zeroOneNapSac(weight, value, cap, size-1);
    }
}
