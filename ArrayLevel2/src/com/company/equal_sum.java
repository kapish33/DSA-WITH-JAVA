package com.company;

import java.util.Scanner;

public class equal_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int [] array=new int[4];
        for ( int i = 0;i < 4;i++) {
            array[i]=sc.nextInt();
            sum += array[i];
        }
        boolean flag =false;
//        int flag=false;
        for(int i=0;i<3;i++){
            for(int j=i+1;j<4;j++){
                if(array[i]+array[j]==sum/2){flag=true;break;}
            }
        }
        if(flag)System.out.println("No");
        else System.out.println("Yes");
        
    }
}
