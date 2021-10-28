package com.company;

import java.util.ArrayList;
import java.util.List;

public class all_subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        Backtrack(nums, 0, res, curr);

        return res;
    }

    static void Backtrack(int[] nums, int start, List<List<Integer>> list, List<Integer> curr){
        list.add(new ArrayList<>(curr));

        for(int i=start; i<nums.length; i++){
            curr.add(nums[i]);
            Backtrack(nums, i+1, list, curr);
            curr.remove(curr.size()-1);
        }
    }
}
