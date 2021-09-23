package com.company;

import java.util.ArrayList;
import java.util.List;

public class Remove_Comments {
    public static void main(String[] args) {
        String[] source = {"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"};
        System.out.println(removeComments(source));
    }
    public static List<String> removeComments(String[] source) {
        List<String> answer = new ArrayList<>();
        boolean isContinue = false;
        StringBuilder temp = new StringBuilder();
        for(String s: source) {
            char[] charArr = s.toCharArray();
            for(int i = 0; i<charArr.length; i++) {
                if(!isContinue && charArr[i] == '/') {
                    if(i+1 < charArr.length && charArr[i+1] == '/') break;
                    else if(i+1 < charArr.length && charArr[i+1] == '*') {
                        isContinue = true;
                        i++;
                        continue;
                    }
                }
                if(isContinue && charArr[i]=='*') {
                    if(i+1 < charArr.length && charArr[i+1] == '/') {
                        isContinue = false;
                        i++;
                        continue;
                    }
                }

                if(!isContinue) {
                    temp.append(Character.toString(charArr[i]));
                }
            }

            if(!isContinue && temp.length()>0) {
                answer.add(new String(temp.toString()));
                temp = new StringBuilder();
            }
        }
        if(temp.length()>0) answer.add(new String(temp.toString()));
        return answer;
    }
}
