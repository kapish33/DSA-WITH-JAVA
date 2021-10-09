package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Two_Sorted_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time =  sc.nextInt();
        for (int i= 0;i<time;i++){
            int size = sc.nextInt();
            int[] array1=  new int[size];
            int[] array2=  new int[size];
            int max1=-1,max2= -1;
            for (int j=0;j<size;j++) {
                array1[j]= sc.nextInt();
                if (max1<array1[j]) max1=array1[j];
            }
            for (int j=0;j<size;j++) {
                array2[j]= sc.nextInt();
                if (max2<array2[j]) max2=array2[j];
            }
            int maxi =  Math.max(size,Math.max(max1,max2));
            System.out.println(coomon(array1,array2,size,maxi));
        }
    }
    public static int coomon(int[] arr1,int[]arr2,int size,int max){
        HashSet<Integer> set = new HashSet<>();
        int ans= 0;

        for (int i = 0;i< arr1.length;i++) set.add(arr1[i]);

        for (int i =0;i< arr2.length;i++){
            if (set.contains(arr2[i])) {
                ans++;
                set.remove(arr2[i]);
            }
        }
        return ans;
    }
}
