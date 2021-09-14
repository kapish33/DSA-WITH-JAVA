package com.company;

public class rotaated_array {
    public static void main(String[] args) {
        int[] array = {7,5,2,3,4};
        System.out.println(lowest_in_rota(array,5));
    }
    public  static int lowest_in_rota(int[] array,int size){
        int low= 0,high = size;
        while (high>low){
            int mid = (low+high)/2;
            if (array[mid]<array[high]){
                high=mid;
            }else {
                low=mid+1;
            }
        }
        return low;
    }
}
