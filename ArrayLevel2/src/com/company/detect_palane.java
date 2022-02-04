package com.company;

import java.util.Scanner;

public class detect_palane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            String sam = sc.next();
            palnen(sam,size);
        }
    }
    public static void palnen(String str,int size){
        int[] array = new int[26];
        for (int i = 0; i < size; i++) {
            array[str.charAt(i)-'a']+=1;
        }
        int count=0;
        for(int i=0;i<26;i++) if(array[i]%2!=0)count++;
        if(count>1) System.out.println("Not Possible!");
        else System.out.println("Possible!");
    }
}
