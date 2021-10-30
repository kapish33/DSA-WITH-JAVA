package com.company;

import java.util.Scanner;

public class print_permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        permutations(sc.next(),"");
    }
    public static void permutations(String sam,String ans){
        if (sam.length()==0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < sam.length(); i++) {
            char ch = sam.charAt(i);
            String ros = sam.substring(0,i)+sam.substring(i+1);
            permutations(ros,ans+ch);
        }
    }
}
