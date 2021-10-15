package com.company;

import java.util.Scanner;

public class fllow_the_knight {
    static int[][] board = new int[10][10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt(),j = sc.nextInt(),n = sc.nextInt();
        printKnightToor(n,i,j);
    }
    public static void printKnightToor(int steps,int i ,int j){
        int count= 0;
        if (i<0 || i>9 || j<0 || j>9){
            if (steps ==0) {
                board[i][j] = 1;
                return;
            }
            printKnightToor(steps-1,i-2,j+1);
            printKnightToor(steps-1,i-2,j-1);

            printKnightToor(steps-1,i-1,j+2);
            printKnightToor(steps-1,i-1,j-2);

            printKnightToor(steps-1,i+2,j+1);
            printKnightToor(steps-1,i+2,j-1);

            printKnightToor(steps-1,i+1,j-2);
            printKnightToor(steps-1,i+1,j+2);
        }
//        int count = 0;
        for (int p = 0;p<board.length;p++) for (int l  = 0;l< board.length;l++) if (board[p][l]==1) count++;
        System.out.println(count);
    }

}
