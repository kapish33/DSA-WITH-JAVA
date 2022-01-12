package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> answer = arrangeLetters(sc.next());
        for (String s: answer) System.out.println(s);
    }
    public static List<String> arrangeLetters(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.isEmpty()) return list;
        String[] keysList = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String str = "";
        makeCombos(keysList,0, str, digits, list);
        return list;
    }
    public static void  makeCombos( String[] keysList,int index, String str, String digits, List<String> list){
        if(index == digits.length()) list.add(str);
        else{
            String chars = keysList[digits.charAt(index)-'2'];
            for(int i=0; i<chars.length(); i++) makeCombos(keysList,index+1, str+chars.charAt(i) , digits, list );

        }
    }
}
