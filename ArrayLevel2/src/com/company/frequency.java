package com.company;
/*
Frequency Between Range -0:30:31
Description

You're given an array of N integers. You need to answer Q queries.

Each query consists of three integers [left , right , value]

For each query print the frequency of value between the range [left , right]


Input
Input Format

The first line contains N , the number of integers and Q the number of queries.

The second lines contains N integers

The next Q lines contains three integers left , right , value

Constraints

1<=N<=10^6

1<=Q<=10^4

1<=left<=right<=10^6

1<=A[i]<=10^6


Output
Print Q lines, each containing the answer the queries


Sample Input 1 

6 2
1 5 3 2 3 2 
3 6 2
4 4 2
Sample Output 1

2
1
Hint

Between the range [3,6] , the value 2 occurs twice


*/
import java.util.Scanner;

public class frequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i< n ;i++){
            
        }
    }
}