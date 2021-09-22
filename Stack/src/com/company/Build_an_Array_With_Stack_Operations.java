package com.company;

import java.util.ArrayList;
import java.util.List;

public class Build_an_Array_With_Stack_Operations {
    public static void main(String[] args) {
        int[] target = {2,4};
        int n = 3;
        System.out.println(buildArray(target,n));
    }

    public static List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int k=0;

        for (int i = 1; i <= n; i++) {
            if (k<target.length && i==target[k]) {
                list.add("Push");
                k++;
            }else if (k<target.length && i!=target[k]){
                list.add("Push");
                list.add("Pop");
            }else{
                break;
            }
        }
        return list;
    }
}
