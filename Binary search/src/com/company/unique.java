package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(unique(sc.next()));
    }
    public static String unique(String sam){

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < sam.length(); i++) {
            set.add(sam.charAt(i));
        }
        if (set.size()==sam.length()) return "Unique";
        else return "No";
    }
}
