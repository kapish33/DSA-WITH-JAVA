package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ash {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int t=0;t<T;t++){
            int N=sc.nextInt();
            int[] ash=new int[N];
            int[] grey=new int[N];
            for (int i=0;i<N;i++)ash[i]=sc.nextInt();
            for (int j=0;j<N;j++)grey[j]=sc.nextInt();
            Arrays.sort(ash);
            Arrays.sort(grey);
            int flag=1;
            for (int k=0;k<N;k++){
                if(ash[k]<=grey[k]){
                    flag=0;
                    break;
                }
            }
            if(flag==1) System.out.println("Ash Finally Wins");
            else System.out.println("Train Hard Again");
        }
    }
}