package com.company;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class distinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]= sc.nextInt();
        }
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        // sum of set
        int sum = 0;
        for (Integer i:set) {
            sum+=i;
        }
        System.out.println(sum);

    }
}
