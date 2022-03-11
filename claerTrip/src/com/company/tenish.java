package com.company;

import java.util.Arrays;

public class tenish {
    public static int calculateTotalPrice(int[] prices, int discount) {
        Arrays.sort(prices);
        int len = prices.length;
        int max = prices[len-1];
        int val =  max*(100-discount)/100;
        int sum = 0;
        for (int i = 0; i < prices.length; i++) sum+=prices[i];
        return sum-val;
    }
}
