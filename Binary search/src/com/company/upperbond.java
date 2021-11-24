
package com.company;
import java.util.Scanner;

public class upperbond {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size =sc.nextInt();
        int key = sc.nextInt();
        int[] aray = new int[size];
        for (int i = 0; i < size; i++) aray[i]= sc.nextInt();
        System.out.println(tpp(aray,key));
    }
    public static int tpp(int[] nums ,int target){
        int low = 0,high = nums.length-1,ans=-1;
        while(low<high){
            int mid = (low+high)/2;
            if (nums[mid]>=target){
                high=mid;
            }else {
                low=mid+1;
            }
        }
        return low;
    }
}