package com.company;

import java.util.Scanner;

public class Largest_forest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char[][] chaacter = new char[size][size];
        for (int i = 0; i < size; i++) {
            String sam = sc.next();
            for (int j = 0; j < sam.length(); j++) {
                chaacter[i][j]=sam.charAt(i);
            }
        }
        System.out.println(longestAdjecentTree(chaacter,size));
    }
    /*
    5
TTTWW
TWWTT
TWWTT
TWTTT
WWTTT
    */
    public static int longestAdjecentTree(char[][] forest,int size) {
        
    }
}
