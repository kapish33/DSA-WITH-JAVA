package com.company;

import java.util.Stack;

public class Duplicate_Brackets {
    public static void main(String[] args) {
        // it will see an expression and will tell does this exp has extra brakets:) and not needed! at all brackets exists
        String sam = "(((a+b))+(b+c))";
        System.out.println(dublicate_check(sam));
    }
    public static boolean dublicate_check(String sam){
        Stack<Character> st = new Stack<>();

        for (int i = 0;i<sam.length();i++){
            char ch = sam.charAt(i);
            if (ch == ')'){
                if (st.peek() =='(') return true;
                else {
                    while (st.peek() != '(') st.pop();
                    st.pop();
                }
            }else {
                st.push(ch);
            }
        }return false;
    }
}
