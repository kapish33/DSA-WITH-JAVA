package com.company;


import java.util.Scanner;

public class Rotate_the_array_easy_version {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times= sc.nextInt();
        for (int i = 0 ;i<times;i++){
            int size = sc.nextInt();
            int shift = sc.nextInt();
            int new_shift = shift%size;
            //entering array
            int[] array = new int[size];
            for (int j =0 ;j<size;j++){
                array[j]= sc.nextInt();
            }
            for (int j =0 ;j<size;j++){
                if (new_shift>0){
                    System.out.print(array[(size+j-new_shift)% array.length]+" ");
                }else {
                    System.out.print(array[j]+" ");
                }
            }
            System.out.println();
        }
    }
}
