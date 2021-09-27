package com.company;

public class Product_of_2_arays {
    public static void main(String[] args) {
        int[] array1 = {1,1,1,1};
        int[] array2 = {1,1,1};
        System.out.println(product(array1,array2));
    }
    public static int product(int[] arr1,int[] arr2){
        int suma=0,sumb=0,size1= arr1.length/2,size2= arr2.length/2;

        for (int i = 0;i< size1;i++) suma=suma+arr1[i]+arr1[arr1.length-1-i];
        if (arr1.length%2!=0) suma=suma+arr1[size1];

        for (int i = 0;i< size2;i++) sumb=sumb+arr2[i]+arr2[arr2.length-1-i];
        if (arr2.length%2!=0) sumb=sumb+arr1[size2];

        return suma*sumb;
    }
}
