package com.company;

import java.util.Scanner;

public class find_no_of_ways {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(findStep(sc.nextInt()));
    }
    public static int findStep(int n) {
        if (n < 2) return 1;
        else if (n == 2) return 2;
        else return findStep(n - 3) + findStep(n - 2) + findStep(n - 1);
    }
}
