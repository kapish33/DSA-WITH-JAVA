package com.company;

import java.util.Scanner;

public class Exit_the_grid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int i = 0;i < test; i++){
            int size = sc.nextInt();
            char[][] matrix = new char[size][size];
            for(int j = 0;j < size;j++){
                String str = sc.next();
                for(int k = 0;k <size;k++){
                    matrix[j][k] = str.charAt(k);
                }
            }
            boolean [][] check=new boolean[size][size];
            System.out.println(checker(matrix,size,check,0,0,0));
        }
    }
    static int checker(char[][] matrix,int n,boolean[][] check,int row,int col,int count){
        if(row<0||row==matrix.length||col<0||col==matrix.length) return count;
        if(check[row][col]) return 0;
        if(matrix[row][col]=='R') {
            check[row][col]=true;
            return checker(matrix,n,check,row,col+1,count+1);
        }
        else if(matrix[row][col]=='U') {
            check[row][col]=true;
            return checker(matrix,n,check,row-1,col,count+1);
        }
        else if(matrix[row][col]=='L') {
            check[row][col]=true;
            return checker(matrix,n,check,row,col-1,count+1);
        }
        else {
            check[row][col]=true;
            return checker(matrix,n,check,row+1,col,count+1);
        }
    }
}
