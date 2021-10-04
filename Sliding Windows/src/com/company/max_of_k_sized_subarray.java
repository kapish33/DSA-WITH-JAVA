package com.company;

public class max_of_k_sized_subarray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(k_sized_subarray_max(array,3));
    }
    public static int k_sized_subarray_max(int[] arr,int size){
        int max = -1,pre_sum = 0;
        for (int i=0;i<size;i++) {
            pre_sum=pre_sum+arr[i];
        }
        max =pre_sum;

        for (int i =size;i<arr.length;i++){

            pre_sum=pre_sum+arr[size]-arr[i-size];
            System.out.println(pre_sum);
            if (max<pre_sum) max= pre_sum;
        }
        return max;
    }
}
