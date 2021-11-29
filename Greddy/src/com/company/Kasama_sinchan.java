package com.company;

import java.util.Scanner;

public class Kasama_sinchan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arraya= new int[size];
        for (int i = 0; i < size; i++) {
            arraya[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(index(arraya,size-1,target));
    }
    public static int index(int[] array,int size,int target){
        int low = 0,high = size;
        while (low<=high){
            int mid = (low+high)/2;
            if (array[mid]>=target) high=mid-1;
            else low =mid+1;
        }
        return low;
    }
}
