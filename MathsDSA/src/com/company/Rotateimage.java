package com.company;

public class Rotateimage {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        /*
        i. transpose of matrix: column1 becomes row1 and so on
        123     147
        456 ->  258
        789     369
        */
        for(int i=0; i<rows; i++){
            for(int j=i; j<columns; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        /*
        ii. reverse the row using 2 pointer approach of swapping 1st & last element, increment pointer till both pointer are at middle position
        147     741
        258 ->  852
        369     963
        */
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][columns-1-j];
                matrix[i][columns-1-j] = temp;
            }
        }
    }
}
