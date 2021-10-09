package com.company;

import java.util.Scanner;
import java.util.Stack;

public class balanced_para {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int times = sc.nextInt();
        for (int i = 0;i<times;i++){
            System.out.println(check(sc.next()));
        }
    }
    public static String check(String sam){
        Stack<Character> st = new Stack<>();
        for (int i = 0;i<sam.length();i++){
            char ch = sam.charAt(i);

            if (ch == '(' ||ch == '[' || ch == '{' ) st.push(ch);
            else if (ch ==')') {
                if (st.size() ==0) return "not balanced";
                else if (st.peek() != '(') return "not balanced";
                else st.pop();
            }
            else if (ch ==']') {
                if (st.size() ==0) return "not balanced";
                else if (st.peek() != '[') return "not balanced";
                else st.pop();
            }

            else if (ch =='}') {
                if (st.size() ==0) return "not balanced";
                else if (st.peek() != '{') return "not balanced";
                else st.pop();
            }

        }
        if (st.size() == 0) return "balanced";
        else return "not balanced";
    }
}
