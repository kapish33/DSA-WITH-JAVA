package com.company;

import java.util.Scanner;

public class one_and_zero_harc {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int run = sc.nextInt();
        for (int i = 0;i<run;i++){
            int n = sc.nextInt(), m = sc.nextInt();
            one2zzeo1(n, m);
            System.out.println();
        }
    }

    public static void one2zzeo1(int noOfZero, int noOfOne) {
        if (noOfOne >= 2 * (noOfZero + 1) || noOfOne < noOfZero - 1) { //as for 11011 it should be
            System.out.print("-1");
        }

        else if (Math.abs(noOfZero - noOfOne) <= 1) {
            while (noOfZero > 0 && noOfOne > 0) {
                System.out.print("01");
                noOfZero--;
                noOfOne--;
            }
            if (noOfZero != 0) {
                System.out.print("0");
            }
            if (noOfOne != 0) {
                System.out.print("1");
            }
        }else{
            while (noOfOne - noOfZero > 1 && noOfZero > 0) {
                System.out.print("110");
                noOfOne = noOfOne - 2;
                noOfZero = noOfZero - 1;
            }
            while (noOfZero > 0) {
                System.out.print("10");
                noOfZero--;
                noOfOne--;
            }
            while (noOfOne > 0) {
                System.out.print("1");
                noOfOne--;
            }
        }
    }
}


//Description
//
//        You need to print a string with N 0s and M 1s, such that no two 0s and no three 1s come together.
//
//        Note:- You need to use all N 0s and M 1s  to form that string. If it is not possible print -1.If there are multiple answers print any one of them
//
//
//        Input
//        Input Format
//
//        First line contains two space separated integers N and M, number of 0s and 1s in string.
//
//        Constraints
//
//        1 <= N,M <= 10^510
//        5
//
//
//
//        Output
//        For each test case output a string in given format on a new line, or else -1 if it is not possible.