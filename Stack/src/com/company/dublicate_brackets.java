package com.company;

import java.util.Scanner;
import java.util.Stack;

public class dublicate_brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(checkBalance(sc.next()));
    }
    public static boolean checkBalance(String sam){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < sam.length(); i++) {
            char ch =  sam.charAt(i);
            if (ch == ')'){
                if (st.peek() == '(') return true;
                else {
                    while (st.peek()!='(') st.pop();
                    st.pop();
                }
            }else {
                st.push(ch);
            }
        }
        return false;
    }
}
