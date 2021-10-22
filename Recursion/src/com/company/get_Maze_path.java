package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class get_Maze_path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(),col = sc.nextInt();

    }
    public static ArrayList<String> getMazePaths(int srv,int srh,int dir_r,int dir_c){
        if (srv ==dir_c && srh == dir_r){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return  bres;
        }
        ArrayList<String> hpahs = new ArrayList<>();
        ArrayList<String> vpahs = new ArrayList<>();
        if (srh < dir_c) getMazePaths(srv, srh+1, dir_r, dir_c);
        if (srv <dir_r) getMazePaths(srv+1, srh, dir_r, dir_c);

        ArrayList<String> path = new ArrayList<>();

        for (String hpath: hpahs) {
            hpahs.add("h"+hpath);
        }
        for (String vpath: vpahs) {
            hpahs.add("v"+vpath);
        }
        return path;
    }
}
