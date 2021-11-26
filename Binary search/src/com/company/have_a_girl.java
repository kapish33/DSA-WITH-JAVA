package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class have_a_girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int boys = sc.nextInt();
            int girls = sc.nextInt();
            int[] boysarr = new int[boys];
            for (int j = 0; j < boys; j++) {
                boysarr[j]=sc.nextInt();
            }
            int[] girlsarr = new int[girls];
            for (int j = 0; j < girls; j++) {
                girlsarr[j]= sc.nextInt();
            }
            System.out.println(have_aGIrl(boys,girls,boysarr,girlsarr));
        }
    }
    public static String have_aGIrl(int boys,int girls,int[] boysarr,int[] girlsarr){
        if (girls<boys) return "NO";
        Arrays.sort(girlsarr);
        Arrays.sort(boysarr);
        int count =0;
        for (int i = 0; i < boys; i++) {
            if (boysarr[i]>girlsarr[i]) count++;
        }
        if (count==boys) return "YES";
        else return "NO";
    }
}
