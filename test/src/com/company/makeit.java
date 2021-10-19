package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class makeit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sam = sc.nextLine();
//        System.out.println(sam);
        System.out.println(unique(sam));
    }

    public static String unique(String sam) {
        Set<Character> set = new HashSet<>();
        StringBuilder ans = new StringBuilder();
        StringBuilder fans = new StringBuilder();
        for (int i = 0; i < sam.length(); i++) {
            if (Character.isAlphabetic(sam.charAt(i))) {
                ans.append(sam.charAt(i));
                set.add(sam.charAt(i));
            }
        }
            for (int i = 0; i < ans.length(); i++) {
                if (set.contains(ans.charAt(i))) {
                    fans = fans.append(ans.charAt(i));
                    set.remove(ans.charAt(i));
                }
            }
        return fans.toString();
    }
}