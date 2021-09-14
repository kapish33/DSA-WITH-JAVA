package com.company;

public class Main {
    public static void main(String[] args) {
        Mysatck s = new Mysatck();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(320);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.print("Elements present in stack :");
        s.print();
        System.out.println(s.size());
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
        }System.out.println("");
    }
    int size() {
        return top+1;
    }
}

