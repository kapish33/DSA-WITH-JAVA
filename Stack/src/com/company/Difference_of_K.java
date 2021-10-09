package com.company;

import java.util.Scanner;

public class Difference_of_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int i=0;i<times;i++){
            int size = sc.nextInt();
            int target = sc.nextInt();
            int[] arr =  new int[size];
            for (int j = 0;j<size;j++) arr[j]=sc.nextInt();
            System.out.println(diff_k(arr,size,target));
        }
    }
    public static String diff_k(int[] arr, int n, int k) {
        int l = 0,r = 0;
        while(r < n) {
            if(arr[r] - arr[l] == k )return "Yes";
            else if(arr[r] - arr[l] > k) l++;
            else r++;
        }
        return "No";
    }
}
