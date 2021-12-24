package com.company;

import java.util.*;

public class issubseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            System.out.println(subseq(sc.next(),sc.next()));
        }
    }
    public static String subseq(String str1,String str2){
        int i=0;
        int j=0;
        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i) == str2.charAt(j))i++;
            j++;
        }
        if(i == str1.length()) return "YES";
        return "NO";
    }
}
