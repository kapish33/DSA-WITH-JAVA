package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class contaions_dublicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int[] array = new int[size];
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ans = new HashSet<Integer>();
        for (int num : nums) ans.add(num);
        return nums.length - ans.size() != 0;
    }
}
