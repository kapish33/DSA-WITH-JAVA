package com.company;

import java.util.Scanner;

public class Maze_Path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print_maze(sc.nextInt(),"");
    }
    public static void print_maze(int question,String ans){
        if (question<0) return;
        if (question==0){
            System.out.println(ans);
            return;
        }
        print_maze(question-1,ans+"1");
        print_maze(question-2,ans+"2");
        print_maze(question-3,ans+"3");

    }
}
