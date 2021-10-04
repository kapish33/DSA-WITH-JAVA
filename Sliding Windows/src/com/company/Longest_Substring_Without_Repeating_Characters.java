package com.company;

import java.util.HashMap;

public class Longest_Substring_Without_Repeating_Characters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        //accure when you are valid and release when till yiu are invalid
        int ans = 0,i=-1,j=-1;
        HashMap<Character,Integer> map = new HashMap<>();

        while (true){
            boolean f1 = false;
            boolean f2 = false;
            //acure
            while (i<s.length()-1){
                f2= true;
                f1 = true;
                i++;
                char ch = s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1); // if value present it will update value or by default it will make them all 1 for initiation

                if (map.get(ch) ==2) break; //if you are in-valid then break
                else { //else if you are invalid then see length
                    int len = i -j;
                    if (len>ans) ans=len;
                }
            }


            //release
            // after being invalid you reaches here then release
            while (j<i){
                j++;
                char ch =  s.charAt(j);
                map.put(ch,map.get(ch)-1);
                if (map.get(ch)==1){
                    break;
                }
            }
            if (f1==false && f2 ==false) break;
        }
        return ans;
    }
}
