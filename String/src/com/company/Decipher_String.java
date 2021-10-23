package com.company;

import java.util.Scanner;

public class Decipher_String {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int times= sc.nextInt();
        for (int t = 0;t<times;t++){
            int size = sc.nextInt();
            String sam = sc.next();
            // for numbers only
            String[] test = sam.split("");
            for (int f= 0;f<size;f=f+2){
//                System.out.println(f);
                String st = test[f];
                int num = Integer.parseInt(test[f+1]);
                for (int p =0;p<num;p++){
                    System.out.print(st);
                }
            }
            System.out.println();
        }
    }
}
