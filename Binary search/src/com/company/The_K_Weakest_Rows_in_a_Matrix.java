package com.company;

import java.util.Map;

public class The_K_Weakest_Rows_in_a_Matrix {
    public static void main(String[] args) {
        int[][]mat =
                {
                        {1,1,0,0,0},
                        {1,1,1,1,0},
                        {1,0,0,0,0},
                        {1,1,0,0,0},
                        {1,1,1,1,1}
                };
        int k = 3;
        int[] ans = kWeakestRows(mat,k);
        for (int i = 0;i<ans.length;i++) System.out.print(ans[i]+" ");
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] asnwer = new int[k];
        int[] track = new int[mat.length];
        int i =0;
        for (int[] mati: mat) {
            track[i++]=transition(mati);
        }
        return track;
    }
    public static int transition(int[] mati){
        int left = 0;
        int right = mati.length;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (mati[mid] == 1)
                left  = mid + 1;
            else right = mid;
        }
        return left;
    }
}