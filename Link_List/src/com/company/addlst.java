package com.company;

public class addlst {
    public  static class  Node {
        int data;
        Node next;

    }
    public static class  LinkedList {
        Node head;
        Node tail;
        int size ;
        void allLast(int val){
            Node temp  = new Node();
            temp.next = null;
            temp.data =val;
            if (size==0){
                head=tail=temp;// both are pointing the temp
            }else {
                tail.next= temp;
                tail = temp;
            }
            size++;
        }
    }

}
