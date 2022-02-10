package com.company;

import java.util.Scanner;

public class GasStation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] gas = new int[size];
        int[] cost = new int[size];
        for (int i = 0; i < size; i++) gas[i] = sc.nextInt();
        for (int i = 0; i < size; i++) cost[i] = sc.nextInt();
        System.out.println(kasaChalu(gas,cost));
    }
    public static int kasaChalu(int[] gas, int[] cost) {
        int curr = 0,total = 0,start = 0;
        for(int i=0; i<gas.length; i++){
            int diff = gas[i]-cost[i];
            curr += diff;
            if(curr<0){
                curr = 0;
                start=i+1;
            }
            total+=diff;
        }
        if(total>=0) return start;
        return -1;
    }
}
