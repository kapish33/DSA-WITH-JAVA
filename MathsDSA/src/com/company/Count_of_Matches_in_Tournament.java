package com.company;

public class Count_of_Matches_in_Tournament {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(6));
    }
    public static int numberOfMatches(int n) {
        int s = 0;
        while(n!=1){
            s+=n/2;
            n=n-n/2;
        }return s;
    }
}
