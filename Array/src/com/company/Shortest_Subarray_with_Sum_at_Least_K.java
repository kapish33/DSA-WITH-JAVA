package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class Shortest_Subarray_with_Sum_at_Least_K {
    public static void main(String[] args) {
        int[] nums = {2,-1,2};
        int k = 3;
        System.out.println(shortestSubarray(nums,k));
    }
    public static int shortestSubarray(int[] nums, int k){
        int nums_size = nums.length,min = Integer.MAX_VALUE;

        int[] pre_sum = new int[nums_size+1];//made a presum array
        for (int i=0;i<nums_size;i++) pre_sum[i+1]=nums[i]+pre_sum[i];// feeded pre_sum array

        Deque<Integer> dq = new LinkedList<>();

        for(int i =0;i<=nums_size;i++){
            while(dq.size()>0&&pre_sum[i]-pre_sum[dq.getFirst()]>=k){
                int idx = dq.pollFirst();
                min=Math.min(i-idx,min);
            }
            while(dq.size()>0&&pre_sum[i]<=pre_sum[dq.getLast()]) dq.pollLast();
            dq.add(i);
        }

        return (min==Integer.MAX_VALUE)? -1 : min;
    }
}
