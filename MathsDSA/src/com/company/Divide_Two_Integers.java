package com.company;

public class Divide_Two_Integers {
    public static void main(String[] args) {
        System.out.println(divide(7,-3));
    }
    public static int divide(int dividend, int divisor) {
        if(dividend == 1<<31 && divisor == -1) return Integer.MAX_VALUE;
        boolean sign=((dividend>=0)==(divisor>=0)?true:false);

        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);

        int q=0;
        while(dividend-divisor>=0){
            int count=0;
            while(dividend-(divisor<<1<<count)>=0){
                count++;
            }
            q+=1<<count;
            dividend -=divisor<<count;

        }
        return sign?q:-q;
    }
}
