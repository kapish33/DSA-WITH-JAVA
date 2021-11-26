package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class such_six_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        int[] array  = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println(count_me(array,size));
    }
    public static int count_me(int[] array,int size){
        int count =0;
        // a * b +c = ( f + e ) * d
//        now explore all options for  LHS
        ArrayList<Integer> array_lhs = new ArrayList<>();
        for (int i = 0; i < size; i++) { // geting a
            for (int j = 0; j < size; j++) { // getting b
                for (int k = 0; k < size; k++) { // getting c
                    array_lhs.add((array[i] *array[j])+array[k]);
                }
            }
        }
        // rhs
        ArrayList<Integer> array_rhs = new ArrayList<>();
        for (int i = 0; i < size; i++) { // geting f
            for (int j = 0; j < size; j++) { // getting e
                for (int k = 0; k < size; k++) { // getting d
                    if (array[k] !=0){
                        int ch_no = (array[i]*array[j])*array[k];
                        if (array_lhs.contains(ch_no)) count++;
                    }
                }
            }
        }
//        System.out.println(array_lhs);

        return count;
    }
}
