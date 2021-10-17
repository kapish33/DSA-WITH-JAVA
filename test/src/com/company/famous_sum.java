package com.company;

import java.util.Scanner;
class famous_sum{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String number=sc.next();
        int times=sc.nextInt();

        long sum_of_num=0;
        for (int i=0;i<number.length();i++) sum_of_num+=number.charAt(i)-'0';
        sum_of_num=sum_of_num*times;

        long len=func(Long.toString(sum_of_num));
        System.out.println(len);
    }
    public static long func(String str){
        long sum=0;
        for (int i=0;i<str.length();i++) sum+=str.charAt(i)-'0';
        if (sum<10) return sum;
        return func(Long.toString(sum));
    }
}