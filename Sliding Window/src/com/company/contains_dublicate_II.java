package com.company;

import java.util.HashMap;
import java.util.Map;

public class contains_dublicate_II {
    public static void main(String[] args) {
        int[] array = {1,2,3,1,2,3};
        int k = 2;
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i< nums.length;i++){
            if (map.containsKey(nums[i]) && Math.abs(i -map.get(nums[i]))<=k) return true;
            else map.put(nums[i],i );
        }
        return false;
    }
}
