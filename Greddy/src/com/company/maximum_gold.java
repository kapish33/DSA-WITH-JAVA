package com.company;

import java.util.Scanner;

public class maximum_gold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(); // for various i
        int cols = sc.nextInt(); // for various j
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j]= sc.nextInt();
            }
        }
        int[][] dp = new int[rows][cols];
        for (int i = rows-1; i >= 0; i--) {
            for (int j = cols-1; j >=0 ; j--) {
                if (j==array[0].length-1){};
                else if (i==0)
            }
        }
    }
}
