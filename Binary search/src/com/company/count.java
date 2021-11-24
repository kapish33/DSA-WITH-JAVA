package com.company;

import java.util.Scanner;

public class count {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for (int j=0;j<test;j++){
            int size=sc.nextInt();
            String str =sc.next();
            int [] arr=new int[10];
            for (int k=0;k<str.length();k++)arr[str.charAt(k)-'0']+=1;

            for (int i=0;i<10;i++)System.out.print(arr[9- i]+" ");
            System.out.println();
        }
    }
}