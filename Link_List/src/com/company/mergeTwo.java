package com.company;

public class mergeTwo {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node mergeTwoLinkedList(Node a,Node b){
        Node result = null;
        if(a == null){
            return b;
        }
        if(b == null){
            return a;
        }
        if(a.data < b.data){
            result = a;
            result.next = mergeTwoLinkedList(a.next,b);
        }else{
            result = b;
            result.next = mergeTwoLinkedList(a,b.next);
        }
        return result;
    }
}
