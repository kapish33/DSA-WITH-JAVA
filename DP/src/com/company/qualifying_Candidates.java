package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class qualifying_Candidates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            int tar = sc.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) {
                array[j]=sc.nextInt();
            }
            System.out.println(qualify(array,tar,size));
        }
    }
    public static int qualify(int[] array,int tar,int n){
        Arrays.sort(array);
        int rank=1;
        int count=1;
        for (int j=n-2;j>=0;j--) {
            if (array[j] == array[j + 1]) count++;
            else {
                rank = count + 1;
                if (rank > tar) break;
                else count++;
            }
        }
        return count;
    }
}
