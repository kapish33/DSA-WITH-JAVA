package com.company;

import java.util.*;

public class count_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i]=sc.nextInt();
        countMe(array,size);

    }
    public static void countMe(int[] array,int size){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (map.containsKey(array[i])) map.put(array[i],map.get(array[i])+1 );
            else map.put(array[i],1 );
        }
        for (Integer i: map.values()) {
            System.out.print(i+" ");
        }

    }
}
