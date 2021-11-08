package com.company;

import java.util.Scanner;

public class Birthday_Shopping {
    public static void combinations(int cb, int tb, int ssf, int ts, String asf){
        if(cb > tb){
            if(ssf == ts){
                System.out.println(asf);
            }
            return;
        }
        combinations(cb + 1, tb, ssf + 1, ts, asf + cb+" ");
        combinations(cb + 1, tb, ssf + 0, ts, asf );
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int nboxes=sc.nextInt();
        int ritems = sc.nextInt();
        combinations(1, nboxes, 0, ritems, "");
    }
}
