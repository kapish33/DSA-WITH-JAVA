package com.company;

import java.util.Scanner;

public class rotaated_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]= sc.nextInt();
        }
//        int[] array = {7,5,2,3,4};
        System.out.println(lowest_in_rota(array,array.length-1));
    }
    public  static int lowest_in_rota(int[] array,int size){
        int low= 0,high = size;
        while (high>low){
            int mid = (low+high)/2;
            if (array[mid]<array[high])high=mid;
            else low=mid+1;
        }
        return low;
    }
}
