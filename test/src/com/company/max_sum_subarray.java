package com.company;

import java.util.Scanner;

public class max_sum_subarray {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=  sc.nextInt();
        int target= sc.nextInt();
        int[] array = new int[size];
        for (int s=0;s<size;s++){
            array[s]= sc.nextInt();
        }// feeded array
        int presum=0;
        for (int p=0;p<target;p++){
            presum=array[p]+presum;
        }
        int max =presum;
        for (int r=target;r<size;r++){
            presum+=array[r];
            presum-=array[r-target];
            if (presum>max){
                max=presum;
            }
        }
        System.out.println(max);
    }
}