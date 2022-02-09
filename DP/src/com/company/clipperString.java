package com.company;

import java.util.Scanner;

public class clipperString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            System.out.println(strCount(sc.nextInt(),sc.next()));
        }

    }
    public static String strCount(int  size,String sam){
        sam=sam+'0';
        int count=1;
        StringBuilder ans= new StringBuilder();
        for(int i=1;i<size;i++) {
            char ch = sam.charAt(i);
            if(ch == sam.charAt(i-1))count++;
            else {
                char ch2=sam.charAt(i-1);
                String str_count=Integer.toString(count);
                ans.append(ch2).append(str_count);
                count=1;
            }
        }
        return ans.toString();
    }
    /*
    static void funct(String str,int len)
    {
        int count=1;
        String ans="";
        for(int i=1;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch==str.charAt(i-1))count++;
            else {
                char ch2=str.charAt(i-1);
                String str_count=Integer.toString(count);
                ans=ans+ch2+str_count;
                count=1;
            }
        }
        System.out.println(ans);
    }
     */
}
