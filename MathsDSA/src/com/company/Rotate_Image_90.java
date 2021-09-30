package com.company;

public class Rotate_Image_90 {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
        for (int[] mat:matrix) {
            for (int val : mat){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
    public static void rotate(int[][] matrix) {
        int r = matrix.length;
        int[][] res = new int[r][r];

        for(int i=0; i<r; i++){
            for(int j=0; j<r; j++){
                res[j][r-1-i] = matrix[i][j];
            }
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<r; j++){
                matrix[i][j] = res[i][j];
            }
        }
    }
}
