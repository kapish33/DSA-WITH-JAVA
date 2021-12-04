package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Nikhil_serach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i]= sc.nextInt();
        Arrays.sort(array);
        // test cases handeling
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int q = sc.nextInt();
            int x = sc.nextInt();
            System.out.println(myfunc(array,n,q,x));
        }
    }
    public static int myfunc(int[] arr, int n,int q,int x) {
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low)/ 2;
            if (q == 0) {
                if (arr[mid] >= x) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            if (q == 1) {
                if (arr[mid] > x) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        if (ans == -1) return 0;
        else return (n - ans);
    }
}
