package com.company;

import java.util.Scanner;

public class stringequal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();
            System.out.println(check(str1, str2, size));
        }

    }
    public static String check(String s1,String s2,int size){
        if(s1.length()!=s2.length())
            return "No";
        int[] count = new int[26];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            count[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0)
                return "No";
        }
        return "Yes";
    }
}
