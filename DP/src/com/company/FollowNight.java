package com.company;

import java.util.Scanner;

public class FollowNight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] chess = new int[10][10];
        System.out.println(followTheKnight(sc.nextInt(), sc.nextInt(), chess));
    }
    public static int followTheKnight(int row,int col ,int[][] chess){
        if(row<0 || row>9 || col<0 || col>9){
            return 0;
        }
        if(chess[row][col]==1){
            return 0;
        }
        if(row==9 && col==9){
            return 1;
        }
        chess[row][col]=1;
        int count=0;
        count+=followTheKnight(row+2,col+1,chess);
        count+=followTheKnight(row+2,col-1,chess);
        count+=followTheKnight(row-2,col+1,chess);
        count+=followTheKnight(row-2,col-1,chess);
        count+=followTheKnight(row+1,col+2,chess);
        count+=followTheKnight(row+1,col-2,chess);
        count+=followTheKnight(row-1,col+2,chess);
        count+=followTheKnight(row-1,col-2,chess);
        chess[row][col]=0;
        return count;
    }
}
