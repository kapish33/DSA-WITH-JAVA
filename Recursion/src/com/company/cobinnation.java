package com.company;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class cobinnation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int len =  sc.nextInt();
        ArrayList<String> asn = gss(sc.next());
        Collections.sort(asn);
        for (String s: asn) {
            if (!Objects.equals(s, "")) System.out.println(s);
        }

    }
    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char first_Char = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = gss(ros);
        ArrayList<String> mres = new ArrayList<>();

        for(String rstr: rres) {
            mres.add(rstr);
            mres.add(first_Char + rstr);
        }
        return mres;
    }
}
