package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class get_Mazepatg_with_jump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> paths =  getMazePathWithJumps(1,1,n,m);
        System.out.println(paths);

    }
    public static ArrayList<String> getMazePathWithJumps(int start_row,int strat_col,int destination_row,int destination_col){
        if (start_row==destination_col && strat_col==destination_col){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths =  new ArrayList<>();
        // horizonatl movement
        for (int h = 1; h <= destination_col-strat_col; h++) {
            ArrayList<String> hpaths = getMazePathWithJumps(start_row, strat_col+h, destination_row, destination_col);
            for (String hpath:hpaths) {
                paths.add("h"+h+hpath);
            }
        }
        //vertical
        for (int v = 1; v <= destination_row-start_row; v++) {
            ArrayList<String> vpaths = getMazePathWithJumps(start_row+v, strat_col, destination_row, destination_col);
            for (String vpath:vpaths) {
                paths.add("v"+v+vpath);
            }
        }
        //diagonal
        for (int d = 1; d <= (destination_row-start_row & destination_col-strat_col); d++) {
            ArrayList<String> dpaths = getMazePathWithJumps(start_row+d, strat_col+d, destination_row, destination_col);
            for (String dpath:dpaths) {
                paths.add("d"+d+dpath);
            }
        }
        return paths;
    }
}
