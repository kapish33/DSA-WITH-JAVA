package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class get_Stare_path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> path = getStarePath(n);
        System.out.println(path);
    }
    public static ArrayList<String> getStarePath(int n ){
        if (n ==0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }else if (n<0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> path1 = getStarePath(n-1);
        ArrayList<String> path2 = getStarePath(n-2);
        ArrayList<String> path3 = getStarePath(n-3);

        ArrayList<String > paths = new ArrayList<>();
        for (String path: path1) {
            paths.add(1+path);
        }
        for (String path: path2) {
            paths.add(2+path);
        }
        for (String path: path3) {
            paths.add(3+path);
        }
        return paths;
    }
}
