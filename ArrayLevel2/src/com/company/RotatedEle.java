package com.company;

import java.util.Scanner;

public class RotatedEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }
}
/*
Rotate Elements -0:7:49
Description

Given a n by n matrix. You have to rotate the elements of each ring of the matrix in the clockwise direction one place.


Input
Input Format

First line will contain a single number n

Next n lines will contain the matrix

Constraints

n<=1000

Elements of the matrix <=10000




Output
You have to display the rotated matrix


Sample Input 1 

4
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
Sample Output 1

1 1 2 3
1 2 2 4
1 3 3 4
2 3 4 4
Hint

Consider this matrix in the form of two rings and rotate the ring by one place in the clockwise direction
*/