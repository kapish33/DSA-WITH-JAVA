package com.company;

public class power_of_num {
    public static void main(String[] args) {
        int num = 2;
        int power= 10;
        System.out.println(recoursePower(num,power));
        System.out.println(iterativePower(num,power));
    }
    public static int recoursePower(int num, int power){
        if(power==0) return 1;
        int x = recoursePower(num,power/2);
        if (power % 2 ==0) return x*x;
        else return x*x*num;
    }
    public static int iterativePower(int a, int b){
        int ans =1;
        while (b>0){
            if (b %2 ==1) ans= ans*a;
            b=b/2;
            a*=a;
        }
        return ans;
    }
}
