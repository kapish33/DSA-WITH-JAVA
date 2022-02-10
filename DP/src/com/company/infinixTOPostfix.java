package com.company;

import java.util.Scanner;
import java.util.Stack;

public class infinixTOPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(calculate(sc.next()));
    }
    public static int calculate(String str) {
        Stack<Integer> stack=new Stack<>();
        int ans=0,sign=1;
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(curr >= '0' && curr <= '9'){
                long n = 0;
                while(i<str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                    n*=10;
                    n+= str.charAt(i)-'0';
                    i++;
                }
                n *= sign;
                ans += n;
                sign = 1;
                i--;
            }else if(curr == '-') sign=-1;
            else if(curr == '('){
                stack.push(ans);
                stack.push(sign);
                ans = 0;
                sign = 1;
            }else if(curr==')'){
                ans *= stack.pop();
                ans += stack.pop();
            }
        }
        return ans;
    }
}
