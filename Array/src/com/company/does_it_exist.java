package com.company;

import java.util.Scanner;
public class does_it_exist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0;i<test;i++) {
            int length = sc.nextInt();
            int[] array = new int[length];
            //feeding integer in
            for (int f = 0 ;f<length;f++){
                array[f]=sc.nextInt();
            }
            int count=0;
            String no1first = "YES";
            String no1second = "YES";
            String no1third = "YES";
            String no1fouth = "YES";
            for (int j = 0;j<length;j++){
                if (length<4){
                    break;
                }else {
                    if (array[j]==0 && no1first.equals("YES")){
                        count--;
                        no1first="NO";
                    }
                    else if (array[j]==1 && no1second.equals("YES") && no1first.equals("NO")){
                        count--;
                        no1second= "NO";
                    }
                    else if (array[j]==3 && no1third.equals("YES") && no1second.equals("NO") && no1first.equals("NO")){
                        count--;
                        no1third="NO";
                    }
                    else if (array[j]==4 && no1fouth.equals("YES") && no1third.equals("NO") && no1second.equals("NO") && no1first.equals("NO")){
                        count--;
                        no1fouth="NO";
                    }
                }
            }if (count<-3){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}