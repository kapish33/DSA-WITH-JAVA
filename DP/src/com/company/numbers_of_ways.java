package com.company;

import java.util.Scanner;

public class numbers_of_ways {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(ways(n,new int[n+1]));
    }
    public static int ways(int n,int[] array){
        if (n==0) return 1;
        else if (n<0) return 0;
        if (array[n]>0) return array[n];
        int n1 = ways(n-1,array);
        int n2 = ways(n-3,array);
        int n3 = ways(n-4,array);
        int cp = n1+n2+n3;
        array[n]=cp;
        return cp;
    }
}
