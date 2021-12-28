package com.company;

public class removeFirstLinkedList {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size(){
            return size;
        }

        public void display(){
            for(Node temp = head; temp != null; temp = temp.next){
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        public void removeFirst(){
            // write your code here\
            if (size==0){
                System.out.println("List is empty");
            }else if (size==1){
                head=tail=null;
                size=0;
            }else {
                head = head.next;
                size--;
            }
        }
    }
}
