package com.company;

import java.util.Scanner;

public class maxOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            int num = sc.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) array[j]= sc.nextInt();
            System.out.println(myanswer(array,size,num));
        }
    }
    public static int myanswer(int[] array,int size,int num){
        int index =-1;
        int maxcount = 0;
        int couont = 0;
        for (int i = 0; i <size; i++) {
            int elemnt = array[size];
            while(elemnt>0){
                if(elemnt%10==num){
                    couont++;
                }
                elemnt/=10;
            }
            if(couont>maxcount){
                maxcount = couont;
                index = i;
            }
        }
        return index;
    }
}
