package com.company;

import java.util.HashMap;
import java.util.Map;

public class MAx_Point_line {
    public int maxPoints(int[][] points) {
        int max = 0;
        for(int i = 0; i < points.length; i++) {
            int samePoint = 1;
            int localMax = 0;
            Map<Double, Integer> map = new HashMap();
            int x1 = points[i][0];
            int y1 = points[i][1];
            for(int j = i + 1; j < points.length; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];

                if(x1 == x2 && y1 == y2) {
                    samePoint ++;
                    continue;
                }

                if(x1 == x2) {
                    map.put(Double.MAX_VALUE, map.getOrDefault(Double.MAX_VALUE, 0) + 1);
                    continue;
                }

                double slope = roundValUptoFourDecimalPlaces((double)(y1-y2)/(double)(x1-x2));

                map.put(slope, map.getOrDefault(slope, 0) + 1);
            }


            for(double key : map.keySet()) {
                int slopeCount = map.get(key);
                if(slopeCount > localMax) {
                    localMax = slopeCount;
                }
            }

            if(localMax + samePoint > max)
                max = localMax + samePoint;
        }

        return max;
    }

    public double roundValUptoFourDecimalPlaces(double value) {
        double factor = Math.pow(10, 4);
        value = value * factor;
        double roundedValue = Math.round(value);
        return roundedValue / factor;
    }
}
