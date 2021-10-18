package com.company;

public class occurance_of_arget_value {
    public static void main(String[] args) {
        int[] array = {1,2,6,4,4,4,5,5,6,7};
        int target = 6;
        int[] arr = ocurance_array(array,target,0,0);
        for (int i : arr) System.out.print(i+" ");
    }
    public static int[] ocurance_array(int[] arr, int x,int idx,int fsf){
        if (idx == arr.length){
            return new int[fsf];
        }
        if (arr[idx]== x) {
            int[] iarr = ocurance_array(arr, x, idx+1, fsf+1);
            iarr[fsf]= idx;
            return iarr;
        }
        else {
            int[] iarr = ocurance_array(arr, x, idx+1, fsf);
            return iarr;
        }
    }
}
