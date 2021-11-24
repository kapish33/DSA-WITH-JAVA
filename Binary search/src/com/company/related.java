package com.company;


import java.util.Scanner;

public class related {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i]=sc.nextInt();
        int key = sc.nextInt();
        int[] ans = searchRange(array,key);
        System.out.println(ans[0]+" "+ans[1]+" "+(ans[1]-ans[0]+1));
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int [] res = new int [2];
        res[0]=-1;
        res[1]=-1;
//        Arrays.fill(res, -1);
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                res[0] = mid;
                end = mid - 1;
            }
            else if(nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        start = 0;
        end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                res[1] = mid;
                start = mid + 1;
            }
            else if(nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return res;
    }
}
