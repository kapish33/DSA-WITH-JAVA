package com.company;

import java.util.Scanner;

public class split_a_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(balancedStringSplit(sc.next()));
    }
    public static int balancedStringSplit(String s) {
        int count = 0, substrings = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'R') count++;
            else count--;
            if(count == 0) substrings++;
        }
        return substrings;
    }
}
