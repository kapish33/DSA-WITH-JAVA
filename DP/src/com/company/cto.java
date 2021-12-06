package com.company;

import java.util.Scanner;

public class cto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int occ= -1;
            int me = sc.nextInt();
            if (me==1){
                System.out.println(i);
                break;
            }
        }
    }
}
