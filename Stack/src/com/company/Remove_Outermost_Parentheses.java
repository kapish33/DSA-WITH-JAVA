package com.company;

public class Remove_Outermost_Parentheses {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        int leng = 0;
        StringBuilder ans = new StringBuilder();
        for (int i =0;i<s.length();i++){
            if (s.charAt(i)=='(' && leng==0) leng++;
            else if (s.charAt(i)==')' && leng==1) leng--;
            else if (s.charAt(i)=='('){
                leng++;
                ans.append('(');
            }else if (s.charAt(i)==')'){
                leng--;
                ans.append(')');
            }
        }
        return ans.toString();
    }
}
