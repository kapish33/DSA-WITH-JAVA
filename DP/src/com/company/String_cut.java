package com.company;

import java.util.Scanner;

/*
You are given a string S. Cut it into 2 equal halves and reverse it.

So, suppose if you have a string "abcxyz" then after performing the above mentioned operation it becomes "cbazyx"

If you have a string "abcdxyz", then after performing the above mentioned operation it becomes "cbadzyx"



*/

public class String_cut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String fisrtHelf = s.substring(0, s.length() / 2);
        String secondHealf = s.substring(s.length() / 2);
        // reverse the second half
        StringBuilder sb = new StringBuilder(secondHealf);
        secondHealf = sb.reverse().toString();
        // reverse the first half
        sb = new StringBuilder(fisrtHelf);
        fisrtHelf = sb.reverse().toString();
        System.out.println( fisrtHelf + secondHealf);
    }
}
