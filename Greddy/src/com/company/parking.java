package com.company;

import java.util.Scanner;

public class parking {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int no_of_park=sc.nextInt();
        sc.nextLine();
        String str1=sc.nextLine();
        String str2=sc.nextLine();


        String[] arr1 = str1.split(" ");
        String[] arr2 = str2.split(" ");

        int [] arr3=new int[arr1.length];
        int [] arr4=new int[arr1.length];

        for (int i=0;i<arr1.length;i++){
            arr3[i]=Integer.parseInt(arr1[i]);
            arr4[i]=Integer.parseInt(arr2[i]);
        }
        int index=0;
        int last=arr4[index];
        no_of_park--;
        int flag=0;
        for(int j=1;j<arr3.length;j++){
            if(arr3[j]<last && no_of_park==0){
                flag=1;
                break;
            }
            if(arr3[j]<last && no_of_park>0) no_of_park--;
            if(arr3[j]>last){
                index++;
                last=arr4[index];
            }
        }
        if(flag==0)System.out.println("Possible");
        else System.out.println("Not Possible");

    }
}