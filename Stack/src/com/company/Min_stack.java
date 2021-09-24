package com.company;

public class Min_stack {
}
class MinStack {

    /** initialize your data structure here. */
    Node top;

    class Node{
        int data;
        Node next;
        int min;

        Node(int data){
            this.data = data;
            min = 0;
        }
    }

    public MinStack() {

    }

    public boolean isEmpty(){
        if(top == null){
            return true;
        }
        else
            return false;
    }

    public void push(int val) {
        Node new_node = new Node(val);

        if(isEmpty()){
            new_node.min = val;
            top = new_node;
        }
        else{
            new_node.min = Math.min(val, top.min);
            Node temp = top;
            top = new_node;
            new_node.next = temp;
        }
    }

    public void pop() {
        if(isEmpty()){
            return;
        }
        else
            top = top.next;
    }

    public int top() {
        if(isEmpty()){
            return 0;
        }
        else
            return top.data;
    }

    public int getMin() {
        return top.min;
    }
}
