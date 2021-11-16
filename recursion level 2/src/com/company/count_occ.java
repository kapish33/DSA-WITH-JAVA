package com.company;

import java.util.Scanner;

public class count_occ {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int j=0;j<T;j++){
            int N=sc.nextInt();
            String str =sc.next();
            int [] arr=new int[10];
            for (int k=0;k<N;k++) arr[str.charAt(k)-'0']+=1;// solution
            for (int i=0;i<10;i++)System.out.print(arr[9-i]+" ");// printing
            System.out.println();
        }
    }
}