package com.company;

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int no_of_park=sc.nextInt();
        sc.nextLine();
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        String[] array1 = str1.split(" ");
        String[] array2 = str2.split(" ");

        int [] arr3=new int[array1.length];
        int [] arr4=new int[array1.length];

        for (int i=0;i<array1.length;i++){
            arr3[i]=Integer.parseInt(array1[i]);
            arr4[i]=Integer.parseInt(array2[i]);
        }
        print(arr3,arr4,no_of_park);
    }
    public static void print(int[] arr3,int[] arr4,int no_of_park){
        int index=0;
        int last=arr4[index];
        no_of_park--;
        int stop=0;
        for(int j=1;j<arr3.length;j++){
            if(arr3[j]<last && no_of_park==0){
                stop=1;
                break;
            }
            if(arr3[j]<last && no_of_park>0) no_of_park--;
            if(arr3[j]>last){
                index++;
                last=arr4[index];
            }
        }
        if (stop==0) System.out.println("Possible");
        else System.out.println("Not Possible");
    }
}