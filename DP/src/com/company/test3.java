package com.company;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ways(n,new int[n+1]));
    }
    public static int ways(int n,int[] array){
        if (n==0) return 1;
        else if (n<0) return 0;
        if (array[n]>0) return array[n];
        int cp = ways(n-1,array)+ways(n-2,array)+ways(n-3,array);
        array[n]=cp;
        return cp;
    }
}
