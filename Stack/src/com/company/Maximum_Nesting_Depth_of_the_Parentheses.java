package com.company;

import java.util.Scanner;

public class Maximum_Nesting_Depth_of_the_Parentheses {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(maxDepth(sc.next()));
    }
    public static int maxDepth(String s) {
        int max= -1,count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '(') count++;
            else if(s.charAt(i) == ')') count--;
            if(count>max) max = count;
        }
        return max;
    }
}
