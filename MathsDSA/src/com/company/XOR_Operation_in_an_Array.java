package com.company;

public class XOR_Operation_in_an_Array {
    public static void main(String[] args) {
        System.out.println(xorOperation(5,3));
    }
    public static int xorOperation(int n, int start) {
        int sum=0;
        for (int i =0;i<n;i++) sum = sum ^ (start+2*i);
        return sum;
    }
}
