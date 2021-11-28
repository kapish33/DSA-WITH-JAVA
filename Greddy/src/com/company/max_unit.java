package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class max_unit {
    public static void main(String[] args) {
        int[][] boxTypes = {{1,3},{2,2},{3,1}};
        int truckSize = 4;
        System.out.println(maximumUnits(boxTypes,truckSize));
    }
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a, b)->{
            return b[1]-a[1];
        });
        int units=0;
        for(int i=0;i<boxTypes.length && truckSize>0;i++){
            if(truckSize>=boxTypes[i][0]){
                truckSize-=boxTypes[i][0];
                units+=boxTypes[i][0]*boxTypes[i][1];
            }else{
                units+=boxTypes[i][1]*truckSize;
                break;
            }
        }
        return units;
    }
}
