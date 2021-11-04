package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class god_pairs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test= sc.nextInt();
        for (int t=0;t<test;t++){//test cases
            int size = sc.nextInt();
            int[] array = new int[size];
            for (int s=0;s<size;s++){
                array[s]= sc.nextInt();
            }
            Arrays.sort(array);
            int count =0;
            for (int i = 0;i<size;i++){
                for (int j = i+1;j<size;j++){
                    if (2*array[i]==array[j]){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}