package com.company;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//	making our own stack
        Mysatck s = new Mysatck();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();
        Stack<Integer> s;
    }
}
class Mysatck{
    int top = -1;
    int a[] = new int[1000];

    boolean isEmpty(){
        return top<0;
    }
    boolean push(int x){
            a[++top]=x;
            return  true;
    }
    int pop(){
        if (top<0){
            System.out.println("Stack Underflow");
            return 0;
        }else {
            int x = a[top--];
            return x;
        }
    }
    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }
    void print(){
        for(int i = top;i>-1;i--){
            System.out.print(" "+ a[i]);
        }
    }
}

