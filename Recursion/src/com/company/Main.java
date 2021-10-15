package com.company;

import java.util.Scanner;
class Main{
    public static void main (String[] args){

        Scanner sc=new Scanner(System.in);
        int times=sc.nextInt();
        for (int t=0;t<times;t++){
            int num=sc.nextInt();
            int [] arr=new int[num];
            for (int i=0;i<num;i++)arr[i]=sc.nextInt();

            int [][]stack=new int [num][2];
            int [][]index=new int[num][2];
            
            int top=-1;
            for (int j=0;j<num;j++){

                while(top>-1 && stack[top][0]<arr[j])
                {
                    index[stack[top][1]][0]=arr[j];
                    int dist=j-stack[top][1];
                    index[stack[top][1]][1]=dist;
                    top--;

                }
                stack[++top][0]=arr[j];
                stack[top][1]=j;

            }
            while(top>-1){
                index[stack[top][1]][0]=-1;
                index[stack[top][1]][1]=-1;
                top--;
            }
            for (int k=num-1;k>=0;k--){
                while(top>-1 && stack[top][0]<arr[k]){
                    int dist=stack[top][1]-k;
                    if (dist<=index[stack[top][1]][1]||index[stack[top][1]][1]==-1){
                        index[stack[top][1]][0]=arr[k];
                    }
                    top--;
                }
                stack[++top][0]=arr[k];
                stack[top][1]=k;

            }

            for (int z=0;z<num;z++) System.out.print(index[z][0]+" ");
            System.out.println();
        }
    }
}