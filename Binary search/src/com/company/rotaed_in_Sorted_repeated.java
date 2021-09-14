package com.company;

public class rotaed_in_Sorted_repeated {
    public static void main(String[] args) {
        int[] array = {3,3,4,7,1,1,2,2};
        int size = array.length-1;
        System.out.println(ans(array,size));

        // not soled
        
    }
    public static int ans(int[] a,int high){
        int low = 0;
        int mid= (low+high)/2;
        while (low<high){
            if (a[mid]<a[high]) high=mid;
            else if (a[mid]>a[high]) low=mid+1;
            else high--;
        }
        return a[high];
    }
}
