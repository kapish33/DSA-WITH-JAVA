package com.company;


public class Longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        //find the shortest String
        String pfx = null;
        for (String s : strs) {
            if (pfx == null || s.length() < pfx.length())
                pfx = s;
        }

        //strip a char from each pfx until you find it at the start of each string
        while(true) {
            boolean isPfx = true;
            for (String s : strs) {
                if (!s.startsWith(pfx)) {
                    pfx = pfx.substring(0, pfx.length()-1);
                    isPfx = false;
                    break;
                }
            }
            if (isPfx)
                break;
        }

        return pfx;
    }
}