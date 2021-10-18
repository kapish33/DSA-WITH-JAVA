package com.company;

public class firts_occurance_in_array {
    public static void main(String[] args) {
        int[] array = {2,6,3,1,5,6,4,1,4,2,2,3};
        int target =  14;
        System.out.println(fist_occurance(array,target,0,array.length-1));
    }
    public static int fist_occurance(int[] array,int target,int index,int length){
        if (index>length) return -1;
        if (array[index]==target) return index;
        return fist_occurance(array,target,index+1,length);
    }
}
