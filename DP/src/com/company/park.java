package com.company;

import java.util.Scanner;

public class park {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            char[][] matrix = new char[row][col];
            int[][] visited = new int[row][col];
            for (int it = 0; it < row; i++) {
                for (int j = 0; j < col; j++) {
                    matrix[it][j]= sc.next().charAt(0);
                }
            }
            System.out.println(boundary(row,col,matrix,visited,0,0,0));
        }

    }
    static int cc= 0;
    public static int boundary(int row,int col,char[][] matrix,int[][] visited,int x,int y,int count){
        if (x<0 || y <0 || x >= row || y >= col || visited[x][y]==1 ) return count;
        visited[x][y] = 1;
        if (matrix[x][y]=='L') {
            cc++;
            boundary(row, col, matrix, visited, x-1, y, count+1);
        }
        if (matrix[x][y]=='R') {
            cc++;
            boundary(row, col, matrix, visited, x+1, y, count+1);
        }
        if (matrix[x][y]=='U') {
            cc++;
            boundary(row, col, matrix, visited, x, y-1, count+1);
        }
        if (matrix[x][y]=='D') {
            cc++;
            boundary(row, col, matrix, visited, x, y+1, count+1);
        }
        return cc;
    }
}
