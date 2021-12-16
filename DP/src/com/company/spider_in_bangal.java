package com.company;

import java.util.Scanner;

public class spider_in_bangal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int jumps = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i]= sc.nextInt();
        System.out.println(solution(array,jumps,size,new int[size]));
    }
    public static int solution(int[] array, int jumps,int size,int[] dp){
        for (int i = size-1; i >= 0; i--) { // 10 30 40 50 20
            int min = Integer.MAX_VALUE;
            int jump = 1;
            while (jump<=jumps && jump+i<size){
                int j =i+jump;
                int val = Math.abs(array[i]-array[j])+dp[j];
                int mini = Math.min(min,val);
                dp[i]=mini;
                jump++;
            }
        }
        return dp[0];
    }

    /*
    function spiderman(n,k,arr,dp){
  for(var i=n-1; i>=0; i--){
     let minimum = 100000
     var jump = 1
     while(jump <= k && jump+i < n){
        var j = i+jump
        var val = Math.abs(arr[i]-arr[j]) + dp[j]
        minimum = Math.min(minimum,val)
        dp[i] = minimum
        jump++
     }
  }
    console.log(dp[0]);
 }
     */
}