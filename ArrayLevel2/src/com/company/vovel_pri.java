package com.company;

import java.util.Scanner;

public class vovel_pri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int t= 0;t<times;t++){
            System.out.println(arrangeVovels(sc.next()));
        }
    }
    public static StringBuffer arrangeVovels(String str){
        StringBuffer vovel = new StringBuffer();
        StringBuilder chars = new StringBuilder();
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') vovel.append(str.charAt(i));
            else chars.append(str.charAt(i));
        }
        return vovel.append(chars);
    }
}
