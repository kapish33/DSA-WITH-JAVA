package com.company;

import java.util.Scanner;

public class merge_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i]= sc.nextInt();
        int[] ans = mergeSort(array,0,size-1);
        for (int i = 0; i < size; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] mergeSort(int[] array,int low ,int high){
        //algo
        if (low==high){
            int[] baseArray = new int[1];
            baseArray[0]=array[low];
            return baseArray;
        }
        int mid = (low+high)/2;
        int[] leftSorted = mergeSort(array,low,mid);
        int[] rightSorted = mergeSort(array,mid+1,high);
        int[] ans =  mergeTwoSortedArrays(leftSorted,rightSorted);
        return ans;
    }

    // helper function
    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        int i = 0, j =0, k = 0;
        int[] ans = new int[a.length + b.length];
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                ans[k] = a[i];
                i++;
                k++;
            }else{
                ans[k] = b[j];
                j++;
                k++;
            }
        }
        while(i < a.length){
            ans[k] = a[i];
            k++;
            i++;
        }
        while(j < b.length){
            ans[k] = b[j];
            k++;
            j++;
        }
        return ans;
    }
}
