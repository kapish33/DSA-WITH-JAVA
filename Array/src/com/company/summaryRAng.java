package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class summaryRAng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i]=sc.nextInt();
        List<String> ans=  summaryRanges(array);
        System.out.println(ans);
    }
    public  static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length==0) return result;
        int pos = 0;
        for(int i=1; i< nums.length; i++){
            if(nums[i]-nums[i-1] !=1){
                StringBuilder sb = new StringBuilder();
                sb.append(nums[pos]);
                if(i-pos-1==0) result.add(sb.toString());
                else result.add(sb.append("->").append(nums[i-1]).toString());
                pos = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(nums[pos]);
        if(nums.length-pos-1==0)
            result.add(sb.toString());
        else  result.add(sb.append("->").append(nums[nums.length-1]).toString());
        return result;
    }
}
