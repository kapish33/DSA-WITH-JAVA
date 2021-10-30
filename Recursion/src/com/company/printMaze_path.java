package com.company;

import java.util.Scanner;

public class printMaze_path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maze(1,1,sc.nextInt(),sc.nextInt(),"");

    }
    public static void maze(int x_init ,int y_init,int x_dest,int y_dest,String ans){
        if (x_init>x_dest || y_init >y_dest) return;
        if (x_init==x_dest && y_init == y_dest) {
            System.out.println(ans);
            return;
        }
        //horizonal move
        maze(x_init+1, y_init, x_dest, y_dest, ans+"h");
        // vertical move
        maze(x_init, y_init+1, x_dest, y_dest, ans+"v");

    }
}
