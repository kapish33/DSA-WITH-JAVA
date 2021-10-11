package com.company;

import java.util.Scanner;

public class process {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        int[] arr1=new int[t],arr2=new int[t];
        for (int i = 0;i<t;i++) arr1[i]=sc.nextInt();
        for (int i = 0;i<t;i++) arr2[i]=sc.nextInt();
    }
}
