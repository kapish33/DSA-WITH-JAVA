package com.company;

import java.util.Scanner;

public class super_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long str=sc.nextLong();
        int k=sc.nextInt();


        long sum = 0;
        while (str != 0) {
            sum = sum + str % 10;
            str = str / 10;
        }
        sum=sum*k;
        System.out.println(superdigit(sum));

    }
    public static  long superdigit(long digit){
        if (digit < 10) return digit;
        else {
            long sum = 0;
            while (digit != 0) {
                sum = sum + digit % 10;
                digit = digit / 10;
            }
            return superdigit(sum);
        }
    }
}
