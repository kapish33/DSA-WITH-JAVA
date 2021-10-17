package com.company;


import java.util.Scanner;

public class Distributing_Treasure {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 0;t<test;t++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int n = sc.nextInt();
            int maxi=0;int maxf=0;
            maxi = Math.max(a,b);
            maxf = Math.max(maxi,c);
            int rem = n-(maxf-a+maxf-b+maxf-c);

            if (rem>0){
                if (rem%3 == 0) System.out.println("Yes");
                else System.out.println("No");
            }else {
                System.out.println("No");
            }
        }
    }
}
