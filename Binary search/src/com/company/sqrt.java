package com.company;

public class sqrt {
    public static void main(String[] args) {
        int digit = 25;
        System.out.println(sqrt(digit));
    }
    public static int sqrt(int n){
        int low = 1,high = n/2,ans=1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (mid*mid<=n) {
                ans = mid;
                low =mid+1;
            }
            else high = mid-1;
        }
        return ans;
    }
}
