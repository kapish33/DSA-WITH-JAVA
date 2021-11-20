package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int key = sc.nextInt();
        int[] artay = new int[size];
        for (int i = 0; i < size; i++) artay[i]= sc.nextInt();
        System.out.println(bin(artay,key));
    }
    public static int bin(int[] array,int key){
        int low =0,high = array.length-1;
        while (low<high){
            int mid = (low+high)/2;
            if (array[mid]==key) return mid;
            else if (array[mid]>key) low=mid+1;
            else if (array[mid]<key) high=mid-1;
        }
        return -1;
    }
}
