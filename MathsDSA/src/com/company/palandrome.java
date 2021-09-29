package com.company;

public class palandrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(25));
    }
    public static boolean isPalindrome(int x) {
        int temp=x,sum=0;
        while(temp>0){
            int last = temp%10;
            temp/=10;
            sum=(sum*10)+ last;
        }
        if(sum==x){
            return true;
        }
        return false;
    }
}
