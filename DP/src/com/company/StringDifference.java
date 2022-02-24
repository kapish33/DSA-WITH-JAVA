package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sam1 = sc.next();
        String sam2 = sc.next();
        System.out.println(stringDiff(sam1,sam2));
    }
    public  static String stringDiff(String sam1,String sam2){
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < sam1.length(); i++) {
            list.add(sam1.charAt(i));
        }
        for (int i = 0; i < sam2.length(); i++) {
            if (list.contains(sam2.charAt(i))) {
               // get index of char
                int index = list.indexOf(sam2.charAt(i));
                list.remove(index);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (char x: list) {
            ans.append(x);
        }
        return ans.toString();
    }
}
