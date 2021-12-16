package com.company;

import java.util.Scanner;

public class coin_change_combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i]= sc.nextInt();
        int pay = sc.nextInt();
        int[] dp = new int[pay+1];
        System.out.println(coin_change_combo(array,dp,pay,size));
    }
    public static int coin_change_combo(int[] array,int[] dp ,int pay,int size){
        dp[0] = 1 ; // becasue we can pay 0 rupees in one way which is don't pay
        for (int i = 0; i < size; i++) { // taking all the coins
            for (int j = array[i]; j <= pay; j++) { // now lets see kaha kaha mil sakta ha
                dp[j]+=dp[j-array[i]];
            }
        }
        return dp[pay];
    }
}
// its a combination for exapmle
//array -> {2,3,5} coins avalable
// amount to be paid = 7
/*
0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | --- dp array of size pay+1



 */