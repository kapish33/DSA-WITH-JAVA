package com.company;

public class recursive_binary_search {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int traget =  4;
        System.out.println(num(array,traget,0, array.length));
    }
    public static int num(int[] array,int target,int left,int right){
        int mid = right+(left-right)/2;
        if (array[mid]==target) return mid;
        else if (array[mid]>target) return num(array, target, left, mid-1);
        else if (array[mid]<target) return num(array, target, mid+1, right);
        return -1;
    }
}
//https://www.desmos.com/calculator/daocnxt46b