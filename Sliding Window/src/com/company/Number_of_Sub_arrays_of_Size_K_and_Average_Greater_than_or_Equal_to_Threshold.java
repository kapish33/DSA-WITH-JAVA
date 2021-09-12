package com.company;

public class Number_of_Sub_arrays_of_Size_K_and_Average_Greater_than_or_Equal_to_Threshold {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3,threshold = 4;
        System.out.println(numOfSubarrays(arr,k,threshold));
    }
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0,sum = 0,i = 0;
        for(i=0; i < k; i++) sum += arr[i];
        if(sum >= threshold*k) count++; // for first count
        i=0;
        for(int j = k; j< arr.length; j++) {
            sum = sum + arr[j] - arr[i];
            if(sum >= threshold*k) count++;
            i++;
        }
        return count;
    }
}
