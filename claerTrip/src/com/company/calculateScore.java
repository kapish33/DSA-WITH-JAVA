package com.company;

public class calculateScore {
    public static void main(String[] args) {
        System.out.println(calculateScore("nothing","bruno","ingenious"));
    }
    public static String calculateScore(String text, String prefixString, String suffixString) {
         return preFix(text,prefixString)+sufix(text,suffixString);
    }
    public static String preFix(String sam,String pre){
        String result = "";
        for (int i = 0; i < Math.min(sam.length(),pre.length()); i++) {
            if (sam.charAt(i)==pre.charAt(i)) result+=sam.charAt(i);
            else break;
        }
        return result;
    }
    public static String sufix(String sam ,String suf){
        String result = "";
        for (int i = Math.min(sam.length(),suf.length())-1; i >=0 ; i--) {
            if (sam.charAt(i)==suf.charAt(i)) result+=sam.charAt(i);
            else break;
        }
        return result;
    }
}
