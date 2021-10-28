package com.company;

import java.util.ArrayList;
import java.util.List;

public class combinaror_size_n {
    public List<List<Integer>> combine(int n, int k) {
        ansList = new ArrayList<>();
        sequences(k,1,n,new ArrayList<>());
        return ansList;
    }
    public static List<List<Integer>> ansList = new ArrayList();
    public static void sequences(Integer k,Integer curr,Integer n,List<Integer> ans){
        if(ans.size() == k){
            // Created new list as ans would be keeping its reference and would change element in ansList;
            List<Integer> list = new ArrayList<>(ans);
            ansList.add(list);
            return;
        }

        for(int i=curr;i<=n;i++){
            //Backtracking part : next 3 lines.
            ans.add(i);

            sequences(k,i+1,n,ans);

            ans.remove(ans.size()-1);

        }


    }

}
