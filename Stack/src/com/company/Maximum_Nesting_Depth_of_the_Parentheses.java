package com.company;

public class Maximum_Nesting_Depth_of_the_Parentheses {
    public int maxDepth(String s) {
        int max= -1,count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '(') count++;
            else if(s.charAt(i) == ')') count--;
            if(count>max) max = count;
        }
        return max;
    }
}
