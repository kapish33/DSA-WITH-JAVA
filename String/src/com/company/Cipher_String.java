package com.company;

import java.util.Scanner;

public class Cipher_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int t= 0;t<times;t++){
            int size= sc.nextInt(); //5
            String ent= sc.next()+"!";
//            char[] sam = sc.next().toCharArray(); //aabcc
            char[] sam = ent.toCharArray(); //aabcc
            char point= sam[0];
            int count=0;
            for (int f= 0;f<ent.length();f++){
                if (sam[f]==point){
                    count++;
                }else {
                    System.out.print(point+""+count);
                    count=1;
                    point=sam[f];
                }
            }
            System.out.println();
        }
    }
}