package com.company;

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        Map<String,Integer> map=new HashMap<>();
        for (int i=0;i<test;i++){
            String str=sc.next();
            if(map.containsKey(str)){
                int val=map.get(str);
                map.put(str,val+1);
            }
            else map.put(str,1);
        }
        TreeMap<String, Integer> sorted = new TreeMap<>(map);
        for(String key : sorted.keySet()) System.out.println(key+" "+sorted.get(key));
    }
}