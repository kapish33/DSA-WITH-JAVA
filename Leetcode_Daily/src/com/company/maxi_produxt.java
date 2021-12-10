package com.company;

import java.util.Scanner;

public class maxi_produxt {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] array = {-5};
        System.out.println(maxproduct(array,1));
    }

    public static int maxproduct(int[] array,int size){
        int pre = 1,suf =1,maxi = array[0];
        for (int i = 0; i < size; i++) {
            if (pre == 0 ) pre=1;
            if (suf ==0 ) suf = 1;

            pre=pre*array[i];
            suf=suf* array[size-i-1];
            maxi = Math.max(maxi,Math.max(pre,suf));
        }
        return maxi;
    }
}
