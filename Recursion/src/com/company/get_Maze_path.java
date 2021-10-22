package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class get_Maze_path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(),col = sc.nextInt();
        ArrayList<String> paths =  getMazePaths(0,0,row-1,col-1);
        System.out.println(paths);
    }
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr > dr || sc > dc) return new ArrayList<>();
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hpaths = getMazePaths(sr, sc + 1, dr, dc);
        ArrayList<String> vpaths = getMazePaths(sr + 1, sc, dr, dc);
        ArrayList<String> paths = new ArrayList<>();

        for(String hpath: hpaths) paths.add('h' + hpath);
        for(String vpath: vpaths) paths.add('v' + vpath);
        return paths;
    }
}
