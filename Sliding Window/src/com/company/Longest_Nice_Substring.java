package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Longest_Nice_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(longestNiceSubstring(sc.next()));
    }
    public static String longestNiceSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0;i<s.length();i++) charSet.add(s.charAt(i)); // got all unique elements
        for (int i = 0;i<s.length();i++){
            if (charSet.contains(Character.toLowerCase(s.charAt(i))) && charSet.contains(Character.toUpperCase(s.charAt(i))))continue;
            String s1= longestNiceSubstring(s.substring(0,i));
            String s2 = longestNiceSubstring(s.substring(i+1));
            return s1.length()>=s2.length()? s1 : s2;
        }
        return s;
    }
}
