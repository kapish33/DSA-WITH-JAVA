package com.company;

import java.util.Stack;

public class stock_span {
    public static void main(String[] args) {
        int[] stocks = {1,5,2,6,9,4,4,6,5,1,6,7,6,9,5,5,2};
        int[] ans = stock_span(stocks);
        for (int a:ans) System.out.print(a+" ");
    }
    public static int[] stock_span(int[] stocks){
        int[] stocks_span = new int[stocks.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0;i< stocks.length;i++){
            while (!stack.isEmpty() && stocks[stack.peek()]<stocks[i]) stack.pop();
            stocks_span[i]=stack.isEmpty() ? i+1: i-stack.peek();
            stack.push(i);
        }
        return stocks_span;
    }
}
