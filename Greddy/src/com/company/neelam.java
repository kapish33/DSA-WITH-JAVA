package com.company;

import java.util.Scanner;

public class neelam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] costs = new int[size];
        for (int i = 0; i < size; i++) costs[i]= sc.nextInt();
        System.out.println(minimize_cost(costs,size));
    }
    public static int minimize_cost(int[] cost,int n){
        int totalcost =0;
        int bbc = 0;
        for (int i = 1; i < n; i++) {
            if (cost[i]<cost[bbc]) {
                totalcost+=((i-bbc)*cost[bbc]);
                bbc=i;
            }
        }
        totalcost+=((n-bbc)*cost[bbc]);
        return totalcost;
    }
}
