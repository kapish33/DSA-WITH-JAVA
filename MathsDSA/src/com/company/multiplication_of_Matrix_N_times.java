package com.company;

public class multiplication_of_Matrix_N_times {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,1,1},{1,1,1},{1,1,1}};
//        int[][] matrix2 = {{1,1,1},{1,1,1},{1,1,1}};
        int times =2;
//        int[][] ans = matrix_multiplication(matrix1,times);
        int[][] ans = matrix_multiplication(matrix1,times);
        for (int i =0;i< ans.length;i++){
            for (int j = 0;j< ans.length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] matrix_multiplication(int[][] matrix,int num){
        int[][] answer = new int[matrix.length][matrix.length];
        for (int i =0 ;i< matrix.length;i++) answer[i][i]=1;
        while (num>0){
            if (num % 2 ==1) answer=matrix_mult(answer,matrix);
            num=num/2;
            matrix=matrix_mult(matrix,matrix);
        }
        return answer;
    }
    public static int[][] matrix_mult(int[][] mat1,int[][] mat2){
        int[][] answer= new int[mat1.length][mat2.length];
        for (int i =0;i< mat1.length;i++){
            for (int j = 0;j< mat2.length;j++){
                answer[i][j]=0;
                for (int k=0;k< mat2.length;k++) answer[i][j]+=mat1[i][j]*mat2[j][i];
            }
        }
        return answer;
    }
}