package com.company;

public class fibon_by_Matrix {
    public static void main(String[] args) {

        System.out.println(fib(4));
    }
    int[][] A = new int[2][2];
    public static int fib(int n) {
        if(n <= 1){
            return n;
        }
        int[][] A = {{1,1},{1,0}};
        return helper(n)[1][0];
    }

    public  static int[][] helper(int current){
        int[][] A = {{1,1},{1,0}};
        if(current == 1){
            return A;
        }
        int[][] temp = helper(current/2);
        if(current % 2 == 0){
            return multiply(temp, temp);
        }else{
            return multiply(multiply(temp, temp), A);
        }
    }

    public static int[][] multiply(int[][] A, int[][] B){
        int[][] result = new int[2][2];
        result[0][0] = A[0][0] * B[0][0] + A[1][0] * B[0][1];
        result[1][0] = A[0][0] * B[1][0] + A[1][0] * B[1][1];
        result[0][1] = A[0][1] * B[0][0] + A[1][1] * B[1][0];
        result[1][1] = A[0][1] * B[1][0] + A[1][1] * B[1][1];
        return result;
    }
}