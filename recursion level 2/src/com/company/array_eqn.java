package com.company;

import java.util.Scanner;

public class array_eqn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] aray = new int[size];
        for (int i = 0; i < size; i++) {
            aray[i]= sc.nextInt();
        }
        Muans(aray,size);
    }

    public static void Muans(int[] array,int size) {
        int even = 0,odd=0;
        for (int i = 0; i < size; i++) {//even
            if(array[i]%2==0) even=even+array[i];
            else odd=odd+array[i];
        }

        System.out.println(2*even+3*odd);
    }
}
