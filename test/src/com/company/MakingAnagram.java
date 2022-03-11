package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MakingAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(makingAnagrams(sc.next(), sc.next()));
    }
    public static int makingAnagrams(String s1, String s2){
        List<Character> list1 = new LinkedList<>();
        int len = s1.length() + s2.length();
        for (int i = 0; i < s1.length(); i++) list1.add(s1.charAt(i));
        for (int i = 0; i < s2.length(); i++) {
            if (list1.contains(s2.charAt(i))){
                int index = list1.indexOf(s2.charAt(i));
                list1.remove(index);
                len-=2;
            }
        }
        return len;
    }
}
/*
function makingAnagrams(s1, s2) {
  // Write your code here
  let s1Obj = {};
  let s2Obj = {};
  let count = 0;
  for (let i = 0; i < s1.length; i++) {
    s1Obj[s1[i]] = s1Obj[s1[i]] + 1 || 1;
  }
  for (let i = 0; i < s2.length; i++) {
    if (s1Obj[s2[i]]) {
      s1Obj[s2[i]]--;
    } else {
      s2Obj[s2[i]] = s2Obj[s2[i]] + 1 || 1;
    }
  }
  for (let key in s1Obj) {
    count += s1Obj[key];
  }
  for (let key in s2Obj) {
    count += s2Obj[key];
  }
  return count;
}

*/