package com.company;


import java.util.*;

public class make_Leaderboard_Med {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int times = sc.nextInt();
        SortedMap<Integer, ArrayList<String>> multivalue = new TreeMap<>(Collections.reverseOrder());
        for (int t=0;t<times;t++){
            String name = sc.next();
            int num = sc.nextInt();
            if (multivalue.containsKey(num)){
                ArrayList<String> b;
                b = multivalue.get(num);
                b.add(name);
                multivalue.put(num,b);
            }else {
                ArrayList<String> b = new ArrayList<>();
                b.add(name);
                multivalue.put(num,b);
                b = null;
            }
        }

        for (Object k:multivalue.keySet()){
            multivalue.get(k).sort(Comparator.naturalOrder());
        }
        int rank =0;
        int track =1;
        for (Object k:multivalue.keySet()){
            if (multivalue.get(k).size()!=1){
                rank=track;
                for (int i = 0;i<multivalue.get(k).size();i++){
                    System.out.println(rank+" "+multivalue.get(k).get(i));
                    track++;

                }rank=rank+multivalue.get(k).size();
            }else {
                System.out.println(track+" "+multivalue.get(k).get(0));
                track++;
            }
        }
//        System.out.println(multivalue);
    }
}
//Description
//
//        You are given name and marks of N different students in a hackerrank contest. Your task is to write a program that makes leaderboard of the students under following conditions:
//
//        - If two students get same marks they get same rank
//
//        - The student placed next to the same marks students will get the rank skipping the intermediate ranks.
//
//        Refer to the sample test case for better understanding.
//
//
//        Input
//        Input Format :
//        First line of input contains N
//
//        Next N line contains name and marks respectively of N different students (where name and marks is separated by a space)
//
//        Constraints :
//
//        1 <= N <= 10^5
//
//        1 <= len(name) <= 10
//
//        1 <= Marks <= 10^5
//
//
//        Output
//        Output N names with their rank. Follow these rules for generating the list:
//
//        1. The students having more mark gets better rank
//
//        2. If students have similar mark, their rank will be same(In case of similar marks, the person whose name comes first in alphabetical order comes first in order. However their rank will be same)
//
//        3. The student placed next to the same marks students will get the rank skipping the intermediate ranks.