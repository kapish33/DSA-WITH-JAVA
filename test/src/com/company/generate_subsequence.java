package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class generate_subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();
        int[] array = new int[test];
        for (int i = 0; i < test; i++) array[i]= sc.nextInt();
        List<List<Integer>> ans = permute(array);
        for (List<Integer> l : ans){
            for (Integer i : l) System.out.print(i+" ");
            System.out.println();
        }


    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null) {
            return result;
        }

        helper(result, new ArrayList<>(), nums, new boolean[nums.length]);
        return result;
    }

    private static void helper(List<List<Integer>> result, List<Integer> temp, int[] nums, boolean[] visited) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            temp.add(nums[i]);
            visited[i] = true;
            helper(result, temp, nums, visited);
            visited[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
    
}
