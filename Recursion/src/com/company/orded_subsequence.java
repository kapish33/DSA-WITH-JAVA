package com.company;

import java.util.Scanner;

public class orded_subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
    public static void gs(String str,String new_str,int curr){
        for (int i = curr; i < str.length(); i++) {
            new_str+=str.charAt(i);
            gs(str,new_str,i+1);
        }
    }
}
