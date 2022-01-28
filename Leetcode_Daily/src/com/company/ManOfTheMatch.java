

package com.company;

import java.util.Scanner;

public class ManOfTheMatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test = sc.nextInt();
        for(int i = 0; i < test ;i++){
            int n = sc.nextInt();
            int[] array = new int[6*n];
            for(int j = 0; j < 6*n; j++){
                array[j] = sc.nextInt();
            }
            System.out.println(winnerWinnerChickenDinner(array));
        }
    }
    public static String winnerWinnerChickenDinner(int[] array) {
        int anuskaKapati=0,devlis=0,shift=0;
        for(int i=0;i< array.length;i++) {
            if(shift==0) {
                devlis+= array[i];
                if(( array[i]%2==0 && (i+1)%6!=0 && i <5) || ( array[i]%2==0 && (i+1)%6==0)) shift=1;
            }
            else if(shift==1) {
                anuskaKapati+= array[i];
                if(( array[i]%2!=0  && (i+1)%6!=0 && i <5) || ( array[i]%2==0 && (i+1)%6==0)) shift=0;
            }
        }
        if(anuskaKapati>devlis) return "anuskaKapati Kohli";
        else if (anuskaKapati<devlis)return "devlis de Villiers";
        else return "Tie";
    }
}
/*
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int n=sc.nextInt();
            int[] arr=new int[6*n];
            for(int j=0;j<6*n;j++)arr[j]=sc.nextInt();
            String ans=funct(arr);
            System.out.println(ans);
        }
    }
    static String funct(int[]arr)
    {
        int Virat=0;
        int AB=0;
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
            if(flag==0)
            {

                AB+=arr[i];

                if((arr[i]==1 && (i+1)%6!=0) || (arr[i]==3 && (i+1)%6!=0) || (arr[i]%2==0 && (i+1)%6==0))
                    flag=1;
            }

            else if(flag==1)
            {


                Virat+=arr[i];
                if((arr[i]==1 && (i+1)%6!=0) || (arr[i]==3 && (i+1)%6!=0) || (arr[i]%2==0 && (i+1)%6==0))
                    flag=0;
            }
        }
        if(Virat>AB)return "Virat Kohli";
        else if (Virat==AB)return "Tie";
        else return "AB de Villiers";
    }
}
*/