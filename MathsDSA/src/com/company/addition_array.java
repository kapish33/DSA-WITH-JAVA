package com.company;

public class addition_array {
    public static void main(String[] args) {
        int[] array  = {1,2,3,4,5};
        System.out.print(ans(array));
    }
    public static int ans(int[] array){
        int sum = 0,size= array.length/2;
        for (int i = 0;i< size;i++) sum=sum+array[i]+array[size*2-1];
        if (array.length%2!=0) sum=sum+array[size+1];
        return sum;
    }
}
