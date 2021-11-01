package com.company;

import java.util.Scanner;
import java.util.Stack;

public class again_balanced_brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isValid(sc.next()));
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(getEquivalentClosingBracket(ch));
            } else if (stack.isEmpty() || stack.pop() != ch) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public char getEquivalentClosingBracket(char ch) {
        if (ch == '(') {
            return ')';
        }
        if (ch == '[') {
            return ']';
        }
        return '}';
    }
}
