package com.company;

import java.util.Scanner;

public class differentwayTOBuy {
    static int flag=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int price=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++)array[i]=sc.nextInt();
        combinator(,size,price,0,"",0,array);
        if(flag==0)System.out.println("-1");
    }
    public static void combinator(int len,int price,int sum,String str,int index,int[] array){
        if(sum == price) {System.out.println(str);flag=1;}
        if(index==len || sum >price) return;
        for(int i=index;i<len;i++) combinator(len,price,sum+array[i],str+Integer.toString(array[i])+" ",i,array);
    }
}
