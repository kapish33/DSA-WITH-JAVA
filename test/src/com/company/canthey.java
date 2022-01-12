package com.company;

import java.util.Scanner;

public class canthey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            System.out.println(canTheyBEqual(sc.nextInt(), sc.next(), sc.next()));        }
    }
    public  static String canTheyBEqual(int size,String a,String b){
        int [] s1 = new int[26];
        int [] s2 = new int[26];
        int count = 0;
        for (int i = 0; i < size; i++) {
            s1[a.charAt(i)-'a']++;
            s2[b.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(s1[i]!=s2[i]){
                count++;
            }
        }
        if(count==0){
            return "Yes";
        }
        return "No";
    }
}
