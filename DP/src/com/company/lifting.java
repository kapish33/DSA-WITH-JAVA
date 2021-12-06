package com.company;

import java.util.Scanner;

public class lifting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            System.out.println(asnwer(sc.next()));
        }
    }
    public static int asnwer(String sam ){
        int count =1;
        for (int i = 0; i < sam.length(); i++) {
            if (sam.charAt(i)!=sam.charAt(i-1)) count++;
        }
        return count;
    }
}
