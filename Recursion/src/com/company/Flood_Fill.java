package com.company;

import java.util.Scanner;

public class Flood_Fill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr =  new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean[][] visited =  new boolean[n][m];
        floodfill(arr,0,0,"",new boolean[n][m]);
    }
    public static void floodfill(int[][] maze, int row, int col, String psf, boolean[][] visited) {
        if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length || maze[row][col] == 1 || visited[row][col]) return;
        else if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(psf);
            return;
        }
        visited[row][col] = true;
        floodfill(maze, row - 1, col, psf + "t", visited);
        floodfill(maze, row, col - 1, psf + "l", visited);
        floodfill(maze, row + 1, col, psf + "d", visited);
        floodfill(maze, row, col + 1, psf + "r", visited);
        visited[row][col] = false;
    }
}
