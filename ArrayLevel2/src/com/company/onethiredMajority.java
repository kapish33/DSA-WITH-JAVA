package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class onethiredMajority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(elementApperedOneThird(arr));
        

    }
    public static int elementApperedOneThird(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        // make frequency of each element
        for(int i = 0;i<array.length;i++){
            // if its not present in map then put it and add 1
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }
            // if its present in map then add 1
            else{
                map.put(array[i],map.get(array[i])+1);
            }
            // find elemnt which is appered more than one third
            if(map.get(array[i])>array.length/3){
                return array[i];
            }

        }
        return -1;
    }
}
