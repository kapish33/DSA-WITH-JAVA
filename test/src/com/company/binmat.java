package com.company;

import java.util.Scanner;

public class binmat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        for (int i = 0;i<row;i++){
            for (int j = 0;j<col;j++){
                int inp = sc.nextInt();
                if (inp==0) mat[i][j]=1;
                else mat[i][j]=0;
            }
        }
        for (int i = 0;i<row;i++){
            for (int j = 0;j<col;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
