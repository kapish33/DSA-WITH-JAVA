package com.company;

import java.util.Scanner;

public class printSS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printSSq(sc.next(),"");
    }
    public static void printSSq(String question,String ans){
        if (question.length()==0){
            System.out.println(ans);
            return;
        }
        char first = question.charAt(0);
        String rest_question =  question.substring(1);
        printSSq(rest_question,ans+"");
        printSSq(rest_question,ans+first);
    }
}
