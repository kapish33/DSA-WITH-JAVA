package com.company;

public class Substrings_of_Size_Three_with_Distinct_Characters {
    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("kapish"));
    }
    public static int countGoodSubstrings(String s) {// we checked for len ==3 each ch
        int count= 0;
        for (int i = 1;i<=s.length()-2;i++){
            if (s.charAt(i-1)!=s.charAt(i) && s.charAt(i)!=s.charAt(i+1) && s.charAt(i-1)!=s.charAt(i+1)){
                count++;
            }
        }return count;
    }
}
