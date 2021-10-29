package com.company;

import java.util.Scanner;

public class Print_Keypad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Print_keys(sc.next(),"");
    }
    public static String[] codes = {",;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void Print_keys(String question,String ans){
        if (question.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = question.charAt(0);
        String rest_que = question.substring(1);

        String codes_for_ch = codes[ch-'0'];
        for (int i = 0; i < codes_for_ch.length(); i++) {
            char cho = codes_for_ch.charAt(i);
            Print_keys(rest_que,ans+cho);
        }
    }
}
