package com.company;

import java.util.Scanner;

public class Team_of_Heroes {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 0 ;t<test;t++){
            //takinmg array len and number
            int size = sc.nextInt();
            int luckno = sc.nextInt();
            //entering array
            int[] array = new int[size];
            for (int j = 0;j<size;j++){
                array[j] = sc.nextInt();
            }//array enetring

            int flag= 0;
            int start = 0;
            int end = size-1;
            while (start<end){
                if (array[start]+array[end]>luckno){
                    end--;
                }else if (array[start]+array[end]<luckno){
                    start++;
                }else {
                    flag=flag+1;
                    break;
                }
            }
            if (flag>0){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
   