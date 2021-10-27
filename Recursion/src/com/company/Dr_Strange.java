package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Dr_Strange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i]= sc.nextInt();
        Stack<Integer> s = new Stack<>();
        func(0,s,array,n);
    }
    public static void func(int ind, Stack<Integer> ds, int[] arr , int n){
        if (ind== n){
            for (Integer i: ds) {
                System.out.print(i);
            }
            System.out.println();
            return;
        }
        ds.add(arr[ind]);
        func(ind+1, ds, arr, n);
        ds.pop();
        func(ind+1, ds, arr, n);
    }
}
