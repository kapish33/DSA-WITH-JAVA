package com.company;

import java.util.Scanner;

public class recordBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) {
                array[j]= sc.nextInt();
            }
            System.out.println(maxChangeCount(array,size)+" "+minChangeCount(array,size));       
        }
    }
    
    public static int maxChangeCount(int[] array, int size) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
                count = 1;
            } else if (array[i] == max) {
                count++;
            }
        }
        return count;
    }
    public static int minChangeCount(int[] array, int size) {
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
                count = 1;
            } else if (array[i] == min) {
                count++;
            }
        }
        return count;
    }
}
/*
Record Breaker -0:28:34
Description

Akhil plays regional volleyball and wants to become a pro. Each season he maintains a record of his play. He tabulates the number of times he breaks his season record for most points and least points in a game. Points scored in the first game establish his record for the season, and he begin counting from there.

Given the scores for a season, determine the number of times Akhil breaks his records for most and least points scored during the season.


Input
Input Format

First-line contains T, no of test cases.

First-line of the each test case contains an integer numbers n - the number of season.

Second-line of the each test case contains n integer numbers a1, a2, ... an — the score of each season.

Constraints

1 <= T <= 10

1 <= n <= 10^3

1 <= a[i] <= 10^8


Output
For each test case, output the two integers first is for breaking most point records, second is for breaking least point records.


Sample Input 1

2
9
10 5 20 20 4 5 2 25 1
10
3 4 21 36 10 28 35 5 24 42
Sample Output 1

2 4
4 0
 */