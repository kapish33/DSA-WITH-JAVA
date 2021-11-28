package com.company;

import java.util.*;

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
//        ArrayList<Integer> array_lhs = new ArrayList<>();
        Set<Integer> array_lhs = new HashSet<>();
        for (int i = 0; i < size; i++) { // geting a
            for (int j = 0; j < size; j++) { // getting b
                for (int k = 0; k < size; k++) { // getting c
                    array_lhs.add((array[i] *array[j])+array[k]);
                }
            }
        }
        // rhs
//        ArrayList<Integer> array_rhs = new ArrayList<>();
        Set<Integer> array_rhs = new HashSet<>();
        for (int i = 0; i < size; i++) { // geting f
            for (int j = 0; j < size; j++) { // getting e
                for (int k = 0; k < size; k++) { // getting d
                    if (array[k] !=0){
                        array_rhs.add((array[i]*array[j])*array[k]);
                    }
                }
            }
        }
        System.out.println(array_lhs);
        System.out.println(array_rhs);

        return count;
    }
}
