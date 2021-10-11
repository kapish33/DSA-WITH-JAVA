package com.company;

import java.util.Stack;

public class largest_area_histogram {
    public static void main(String[] args) {
        int[] maxspan = {1,5,5,3,4,7,7}; //  height given
    }
    public static int largest_histogram(int[] arr){
        int maxArea = 0;
        int[] rb = new int[arr.length]; // next on right(index)
        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);
        rb[arr.length-1]= arr.length;
        for (int i =arr.length-2;i>=0;i--){
            while (!st.isEmpty() && arr[i]<arr[st.peek()]) st.pop();
            rb[i]= st.isEmpty() ? arr.length:st.peek();
            st.push(i);
        }
        int[] lb = new int[arr.length]; // next on left(index)
        st.empty();
        st.push(0);
        lb[0]= -1;
        for (int i =1;i<arr.length;i++){
            while (!st.isEmpty() && arr[i]<arr[st.peek()]) st.pop();
            rb[i]= st.isEmpty() ? arr.length:st.peek();
            st.push(i);
        }

        for (int i = 0;i<arr.length;i++){
            int width = rb[i]-lb[i]-1;
            int area = arr[i]*width;
            if (area>maxArea) maxArea= area;
        }
        return maxArea;
    }
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max =0;

        st.push(-1);

        for(int i=0;i<=heights.length;i++){
            int val = i==heights.length? 0:heights[i];

            while(st.peek() >=0 && heights[st.peek()] >= val){
                int h = heights[st.pop()];
                int start = st.peek();
                max = Math.max(max, h*(i-start-1));
            }
            st.push(i);
        }
        return max;
    }
}