package com.company;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int size = str.length();
        int count = 0;
        int[] array = new int[size];
        for(int i=size-1;i>=0;i--){
            if((str.charAt(i)-'0')%2==0) count++;
            array[i] = count;
        }
        for(int i=0;i<size;i++)System.out.print(array[i]+" ");
    }
}