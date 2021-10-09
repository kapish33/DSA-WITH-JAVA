package com.company;

import java.util.Scanner;
class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int i = 0;i<times;i++) uniqueElement(sc.next());
    }
    public static  void uniqueElement(String sam){
//        2
//        abadbc  --> aabbdd
//        abcabc  --> aaabc#
        String str = "";
        int[][] preRequisit = new int[26][2];
        for (int i=0;i<26;i++) preRequisit[i][0]=i+97;;
        for (int i = 0;i<26;i++) System.out.print(preRequisit[i][0]+" ");
        System.out.println(str);
    }
}