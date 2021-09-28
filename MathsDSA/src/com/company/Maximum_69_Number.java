package com.company;

public class Maximum_69_Number {
    public static void main(String[] args) {
        System.out.println(maximum69Number(969669));
    }
    public static int maximum69Number (int num) {
        int tempNum = num;
        int counter = 0;
        int sixPos = -1;

        while (tempNum != 0) {
            if (tempNum % 10 == 6) sixPos = counter;
            counter++;
            tempNum /= 10;
        }
        if (sixPos < 0) return num;   // if sixPos is -ve means num have not 6, So just return the num.
        else return (int) (num + (3 * Math.pow(10, sixPos))); // otherwise change left most 6 to 9.
    }
}
