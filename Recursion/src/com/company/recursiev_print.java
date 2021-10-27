package com.company;

public class recursiev_print {
    private static final String[] D10 = {"Zero ", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten "};
    public static void main(String[] args) {
        int num= 123;
        System.out.println(pri(num));
    }
    public  static String pri(int num){
        if (num<9) return D10[num];
        return pri(num/10)+D10[num%10];
    }
}
