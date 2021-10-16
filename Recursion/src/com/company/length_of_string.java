package com.company;

import java.util.Scanner;

public class length_of_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(length(sc.next()));
    }
    public static int length(String s){
        if (s.equals("")) return 0;
        else return length(s.substring(1))+1;
    }
}
