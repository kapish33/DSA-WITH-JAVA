package com.company;

import java.util.ArrayList;
import java.util.List;

public class N_queens {
    public void solve(List<List<String>> list, ArrayList<String> li, int row, int n, boolean[] columns, boolean[] normalDiagonal, boolean[] reverseDiagonal) {
        if(row == n) {
            list.add(new ArrayList<String>(li));
            return;
        }
        for(int col = 0; col < n; col++) {
            if(columns[col] == false && normalDiagonal[row + col] == false && reverseDiagonal[row - col + n - 1] == false) {
                char[] boardRow = new char[n];
                Arrays.fill(boardRow, '.');
                boardRow[col] = 'Q';
                String rowString = new String(boardRow);
                li.add(rowString);
                columns[col] = true;
                normalDiagonal[row + col]  = true;
                reverseDiagonal[row - col + n - 1] = true;
                solve(list, li, row + 1, n, columns, normalDiagonal, reverseDiagonal);
                li.remove(li.size() - 1);
                columns[col] = false;
                normalDiagonal[row + col]  = false;
                reverseDiagonal[row - col + n - 1] = false;
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList();
        boolean[] columns = new boolean[n];
        boolean[] normalDiagonal = new boolean[2 * n - 1];
        boolean[] reverseDiagonal = new boolean[2 * n - 1];
        solve(list, new ArrayList<String>(), 0, n, columns, normalDiagonal, reverseDiagonal);

        return list;
    }
}
