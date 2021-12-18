package com.company;

import java.util.Scanner;

public class count_biary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println(binaryNoZeros(size));
    }
    public static int binaryNoZeros(int size){
        int zeros = 1,ones =1;
        for (int i = 1; i < size; i++) {
            int o = ones;
            ones = zeros+ones;
            zeros=o;
        }
        return ones+zeros;
    }
}
