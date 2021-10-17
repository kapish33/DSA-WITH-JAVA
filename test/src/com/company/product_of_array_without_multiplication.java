package com.company;

import java.util.Scanner;

public class product_of_array_without_multiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for(int clao = 0;clao<times;clao++){
            int size = sc.nextInt();


            int[] array = new int[size];
            int[] left = new int[size];
            int[] right = new int[size];
            int[] prod = new int[size];

            left[0]=1;
            right[size-1]=1;
            for (int i = 0;i<size;i++){
                array[i]= sc.nextInt();
            }

            for (int i = 1;i<size;i++){
                left[i]=array[i-1]*left[i-1];
            }
            //left updateing
            for (int i = size-2;i>=0;i--){
                right[i]=array[i+1]*right[i+1];
            }
            //prod up
            for (int i = 0;i<size;i++){
                prod[i] = left[i] * right[i];
            }
            //printing array
            for (int i = 0;i<size;i++){
                System.out.print(prod[i]+" ");
            }
            System.out.println();
        }
    }
}
