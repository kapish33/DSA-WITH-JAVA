package com.company;

import java.util.Scanner;

public class ubp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size =sc.nextInt();
        int key = sc.nextInt();
        int[] aray = new int[size];
        for (int i = 0; i < size; i++) aray[i]= sc.nextInt();
        System.out.println(ubp(aray,key));
    }
    public static int ubp(int[] nums ,int target){
        int start = 0,end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if (nums[mid]==target){
                end=mid+1;
            }
            if (nums[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return start;
    }
}
