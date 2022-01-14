package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class Balanedsubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(findMaxLength(arr,size));
        }
    }
    public static int findMaxLength(int[] array,int size) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0, sum = 0;
        map.put(0, -1);
        for(int i = 0; i < size; i++){
            sum += (array[i] == 0 ? -1 : 1);
            if(map.containsKey(sum)) res = Math.max(res, i - map.get(sum));
            else map.put(sum, i);
        }
        return res;
    }
}