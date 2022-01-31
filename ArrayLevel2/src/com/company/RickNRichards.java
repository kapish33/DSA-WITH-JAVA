package com.company;

import java.util.Scanner;

public class RickNRichards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) {
                array[j]= sc.nextInt();
            }
        }
    }
    public static void eatBanana(int n,int[] array) {
        int left = 0;
        int right = n - 1;

        while (left < right) {
      
          int time = array[left] / 2;
          left++;
        
          if (time <= array[right]) {
            
            if (array[right] == time) {
              right--;
              time = 0;
            } 
            else if(array[right] > time){
              int remain = array[right] - time;
              array[right] = remain;
              time = 0;
            }
          }
          else {
            while (time != 0 && left != right) {
              if (array[right] > time) {
                int remain = array[right] - time;
                array[right] = remain;
                time = 0;
              } else {
                int time = time - array[right];
                right--;
              }
            }
          }
        }
        System.out.println(left,n-left);
//        console.log(left, n-left);
      }
}
/*
function eatBanana(n, array) {
  var left = 0;
  var right = n - 1;
  while (left < right) {

    var time = array[left] / 2
    left++
  
    if (time <= array[right]) {
      
      if (array[right] == time) {
        right--;
        time = 0
      } 
      else if(array[right] > time){
        var remain = array[right] - time;
        array[right] = remain;
        time = 0
      }
    }
    else {
      while (time !== 0 && left !== right) {
        if (array[right] > time) {
          var remain = array[right] - time;
          array[right] = remain;
          time = 0
        } else {
          var time = time - array[right];
          right--
        }
      }
    }
  }
  console.log(left, n-left);
}
*/