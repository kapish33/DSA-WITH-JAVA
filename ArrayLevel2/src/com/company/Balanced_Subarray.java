package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Balanced_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) array[j]= sc.nextInt();
            System.out.println(maxBalanced(array,size));
        }
    }
    public static int maxBalanced(int[] array,int size) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < size; i++) {
            count = count + (array[i] != 1 ? -1 : 1);
            if (map.containsKey(count)) maxlen = Math.max(maxlen, i - map.get(count));
            else map.put(count, i);
        }
        return maxlen;
    }
}
/*
public class Solution {

    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }
}

 */
