package com.company;

import java.util.Scanner;

public class encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printEncoding(sc.next(),"");
    }
    public static void printEncoding(String que,String ans){
        if (que.length()==0){
            System.out.println(ans);
            return;
        }else if (que.length() == 1){
            char ch = que.charAt(0);
            if (ch == '0'){
                return;
            }else {
                int chv = ch - '0';
                char code = (char)('a'+ chv -1);
                System.out.println(ans+code);
            }
        }else {
            char ch =  que.charAt(0);
            String ros =  que.substring(1);
            if (ch == '0'){
                return;
            }else {
                int chv = ch - '0';
                char code = (char)('a'+ chv -1);
                printEncoding(ros,ans+code);
            }
            String ch12 = que.substring(0,2);
            String roq = que.substring(2);

            int ch12v = Integer.parseInt(ch12);
            if (ch12v<= 26){
                char code = (char) ('a'+ch12v-1);
                printEncoding(roq,ans+code);
            }
        }
    }
}
