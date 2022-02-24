package com.company;

import java.util.Scanner;

public class birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        combine(0,sc.nextInt(), sc.nextInt(), 0,"",1);
    }
    public static void combine(int start,int size,int select,int collected,String str,int i ){
        if (start > size) return;
        if (collected == select){
            System.out.println(str);
            return;
        }
        combine(start+1, size, select, collected+1, str+i+" ",i+1);
        combine(start+1, size, select, collected, str,i+1);
    }
}
