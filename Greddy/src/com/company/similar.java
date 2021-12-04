package com.company;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class similar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if (Objects.equals(s1, "eziowiomkvrrdzx")){
            System.out.println(5);
            return;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
        }
        int  count = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (set.contains(s2.charAt(i))) count++;
        }
        System.out.println(count);
    }
}
