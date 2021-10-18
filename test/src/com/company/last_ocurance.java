package com.company;

public class last_ocurance {
    public static void main(String[] args) {
        int[] array = {2,6,3,1,5,6,4,1,4,2,2,3};
        int target =  12;
        System.out.println(last_occurance(array,target,array.length-1));
    }

    public static int last_occurance(int[] array, int target,int index_last) {
        if (index_last<0) return -1;
        else if (array[index_last]==target) return index_last;
        return last_occurance(array, target, index_last-1);
    }
}
