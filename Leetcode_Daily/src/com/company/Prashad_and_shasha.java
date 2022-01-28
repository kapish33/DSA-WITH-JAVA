package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Prashad_and_shasha {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0;i < test; i++) {
            String str1 = sc.next();
            String str2 = sc.next();
            System.out.println(func(str1,str2) ? "True":"False");
        }
    }
    private static boolean func(String str1,String str2) {
        if(str1.length()!=str2.length()) return false;
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}