package com.company;

import java.util.Scanner;

public class geerate_all_subseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        subsequence("abc","",0);
    }


    public static void subsequence(String sam,String new_str,int curr) {
        if (new_str.length()>0) System.out.println(new_str);
        if (curr == sam.length()) return;
        for (int i = curr; i < sam.length(); i++) {
            new_str+=sam.charAt(i);
            subsequence(sam,new_str,curr+1);
            new_str.substring(new_str.length()-1);
        }
    }
}
