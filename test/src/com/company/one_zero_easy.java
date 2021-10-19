package com.company;

import java.util.Scanner;

public class one_zero_easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int zero = sc.nextInt();
            int one = sc.nextInt();
            //ones and zeros enteed
//            int[] string = new int[10];
            StringBuilder ans = new StringBuilder();
            if (zero-one==1){
                for (int z =0;z<one;z++) {
                    ans.append("01");
                }
                ans.append("0");
                System.out.println(ans);
            }else if (one-zero==1){
                for (int z =0;z<zero;z++) {
                    ans.append("10");
                }
                ans.append(1);
                System.out.println(ans);
            }else if (one==zero){
                for (int z =0;z<zero;z++) {
                    ans.append("10");
                }
                System.out.println(ans);
            }
            else{
                System.out.println("-1");
            }
        }
    }
}


/*
Description

You need to print a string with N 0s and M 1s, such that no two 0s and no two 1s come together.

Note:- You need to use all N 0s and M 1s to form that string. If it is not possible print -1.If there are multiple answers print any one of them


Input
Input Format

First line contains T, no of testcases.

First line of each test case contains two space separated integers N and M, number of 0s and 1s in string.

Constraints

1 <= N,M <= 10^510
5



Output
For each test case output a string in given format on a new line, or else -1 if it is not possible.
 */
