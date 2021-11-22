package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Nikhil_serach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i]= sc.nextInt();
        Arrays.sort(array);
        // test cases handeling
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            System.out.println(-(upper_bound(array,sc.nextInt(),n)-lower_bound(array, sc.nextInt(), n))-1);
        }
    }
    public static int lower_bound(int[] array,int key,int length){
        int low = 0,high=length-1,ans =-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (array[mid]==key) {
                ans=mid;
                high=mid+1;
            }
            if (array[mid]<key) low=mid+1;
            else high=mid-1;
        }
        return ans;
    }
    public static int upper_bound(int[] array,int key,int length){
        int low = 0,high=length-1,ans =-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (array[mid]==key) {
                ans=mid;
                low=mid+1;
            }
            if (array[mid]<key) low=mid+1;
            else high=mid-1;
        }
        return ans;
    }
}
