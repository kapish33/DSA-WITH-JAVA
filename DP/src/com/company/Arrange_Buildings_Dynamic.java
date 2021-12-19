package com.company;

import java.util.Scanner;

public class Arrange_Buildings_Dynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(ways(sc.nextInt()));
    }
    public static int ways(int size){
        int building = 1,space =1;
        for (int i = 1; i < size; i++) {
            int o = space;
            space = building+space;
            building=o;
        }
        return (space+building)*(space+building);
    }
}
