package com.company;

import java.util.Scanner;

public class print_maze_with_jump {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        printMazePaths(1,1,sc.nextInt(),sc.nextInt(),"");
    }
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr > dr || sc > dc){
            return;
        }

        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        for(int move = 1; move <= dc - sc; move++){
            printMazePaths(sr, sc + move, dr, dc, psf + "h" + move);
        }

        for(int move = 1; move <= dr - sr; move++){
            printMazePaths(sr + move, sc, dr, dc, psf + "v" + move);
        }

        for(int move = 1; move <= dc - sc && move <= dr - sr; move++){
            printMazePaths(sr + move, sc + move, dr, dc, psf + "d" + move);
        }
    }
}
