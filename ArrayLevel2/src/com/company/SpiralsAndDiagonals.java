package com.company;


import java.util.Scanner;
public class SpiralsAndDiagonals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int t=0;t<times;t++){
            int size = sc.nextInt();
            int[][] spiral = new int[size][size];

            int value = 1;
            int minCol = 0;
            int maxCol = size-1;
            int minRow = 0;
            int maxRow = size-1;

            while (value <= size*size) {
                for (int i = minCol; i <= maxCol; i++){
                    spiral[minRow][i] = sc.nextInt();
                    value++;
                }

                for (int i = minRow+1; i <= maxRow; i++){
                    spiral[i][maxCol] = sc.nextInt();
                    value++;
                }

                for (int i = maxCol-1; i >= minCol; i--){
                    spiral[maxRow][i] = sc.nextInt();
                    value++;
                }

                for (int i = maxRow-1; i >= minRow+1; i--){
                    spiral[i][minCol] = sc.nextInt();
                    value++;
                }

                minCol++;
                minRow++;
                maxCol--;
                maxRow--;
            }
            int sum =0;
            for (int i = 0; i < size; i++){
                for (int j = 0; j < size; j++){
                    if (i+j==size-1 || i==j){
                        sum=spiral[i][j]+sum;
                    }
                }
            } System.out.println(sum);
        }
    }
}