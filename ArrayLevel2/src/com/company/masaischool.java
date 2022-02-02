package com.company;

import java.util.Scanner;

public class masaischool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col =  sc.nextInt();
        char[][] matrix = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }

    }
}
