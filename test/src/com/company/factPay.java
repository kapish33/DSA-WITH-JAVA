package com.company;

import java.util.Scanner;

public class factPay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            System.out.println(ways(sc.nextInt()));
        }
    }
    static int[] factorail = {1,2,6,24,120,720,5040,40320,3627880,3628800};
    public static int ways (int pay){
        int steps = 0;
        while (pay != 0){
            for (int i = factorail.length - 1; i >=0; i--) {
                if (factorail[i]<=pay) {
//                    System.out.println(pay+"Phoenpya");
                    pay-=factorail[i];
//                    System.out.println(pay+" "+factorail[i]);
                    steps++;
                    break;
                }
            }
        }
        return steps;
    }
}
