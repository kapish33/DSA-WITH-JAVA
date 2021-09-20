package com.company;

import java.util.Stack;

public class Final_Prices_With_a_Special_Discount_in_a_Shop {
    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        int[] ans = finalPrices(prices);
        for (int an : ans) System.out.print(an + " ");
    }
    public static int[] finalPrices(int[] prices) {
        //smallest left element.
        int[] ans = new int[prices.length];
        ans[prices.length-1] = prices[prices.length-1];
        Stack<Integer> stack = new Stack<>();
        stack.push(prices[prices.length-1]);
        for (int i= prices.length-2; i>=0 ;i--){
            while(!stack.isEmpty() && stack.peek()>prices[i])stack.pop();
            ans[i]=stack.isEmpty()?prices[i]:prices[i]-stack.peek();
            stack.push(prices[i]);
        }
        return ans;
    }
}
