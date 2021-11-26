package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]= sc.nextInt();
        }
        System.out.println(max_num(array,size));
    }
    public static int max_num(int[] array,int size){
        Arrays.sort(array);
        int ans =0;
        for (int i = 1; i < size; i++) {
            ans+=array[i]*i;
        }
        return ans;
    }
}
