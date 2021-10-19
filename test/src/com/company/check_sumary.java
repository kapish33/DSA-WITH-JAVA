package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class check_sumary {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int times= sc.nextInt();
        for (int t= 0;t< times;t++){
            int size = sc.nextInt();
            String[][] matrix = new String[size][size];
            String[][] horizontal = new String[size][size];
            String[][] vertical = new String[size][size];
            for (int k = 0;k<size;k++){
                String[] inp = sc.next().split("");
                for (int j = 0;j<size;j++){
                    matrix[k][j]= inp[j];
                    horizontal[size-1-k][j]= inp[j];
                    vertical[k][size-1-j]= inp[j];
                }
            }
            //
//            for (int k = 0;k<size;k++){
//                for (int j = 0;j<size;j++){
//                    System.out.print(horizontal[k][j]);
//                }
//                System.out.println();
//            }
            if (Arrays.deepEquals(matrix, horizontal) && Arrays.deepEquals(matrix, vertical)){
                System.out.println("BOTH");
            }else if (Arrays.deepEquals(matrix, vertical)){
                System.out.println("VERTICAL");
            }else if (Arrays.deepEquals(matrix, horizontal)){
                System.out.println("HORIZONTAL");
            }else {
                System.out.println("NO");
            }
        }
    }
}

/*
Description

You are given a square matrix of size n. Rows are indexed 1 to n from top to bottom and columns are indexed 1 to n form left to right. Matrix consists of only '*' and '.'. You need to check whether matrix is symmetric or not. if it is, check it is symmetric about vertical axis or horizontal axis or both.

A matrix is said to be symmetric about horizontal axis if 1st row is identical to n-th row, 2nd is identical to (n-1)th row and so on.

A matrix is said to be symmetric about vertical axis if 1ST column is identical to nth column, 2nd identical to (n-1)th and so on for all columns.


Input
Input Format :

First line contains t,the number of test cases. First line of each test case contains n the size of matrix. Each of next n lines contain n characters.


Constraints :

1<=t<=500

1<n<50


Output
Output t lines, answer for each test case. Print "HORIZONTAL" if symmetric about horizontal axis. Print "VERTICAL" if symmetric about vertical axis. Print "BOTH" if symmetric about both axes. print "NO" if it is not symmetric.



 */