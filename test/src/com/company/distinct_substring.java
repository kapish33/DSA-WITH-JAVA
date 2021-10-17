package com.company;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class distinct_substring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 0; t < test; t++) {
            int size = sc.nextInt();
            String samp = sc.next();

            Set<String> result = new HashSet<>();

            for (int i = 0; i<= samp.length(); i++) {
                for (int j = i + 1; j <= samp.length(); j++) {
                    result.add(samp.substring(i, j));
                }
            }
            System.out.println(result.size());
        }
    }
}