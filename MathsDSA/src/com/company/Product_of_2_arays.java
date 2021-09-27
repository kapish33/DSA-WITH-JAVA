package com.company;

public class Product_of_2_arays {
    public static void main(String[] args) {
        int[] array1 = {1,1,1,1};
        int[] array2 = {1,1,1};
        System.out.println(product(array1,array2));
    }
    public static int product(int[] arr1,int[] arr2){
        int ans = 0;
        for (int i = 0;i<arr1.length;i++){
            for (int j = 0;j< arr2.length;j++){
                ans=ans+arr1[i]*arr2[j];
            }
        }
        return ans;
    }
}
