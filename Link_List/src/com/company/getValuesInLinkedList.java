package com.company;

public class getValuesInLinkedList {
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
            if(size == 0){
                System.out.println("List is empty");
            } else if(size == 1){
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public int getFirst(){
            // write your code here
            if (size ==0){
                System.out.println("List is empty");
                return -1;
            }else {
                return head.data;
            }
        }

        public int getLast(){
            // write your code here
            if (size ==0){
                System.out.println("List is empty");
                return -1;
            }else {
                return tail.data;
            }
        }

        public int getAt(int idx){
            // write your code here
            if (size ==0){
                System.out.println("List is empty");
                return -1;
            }else if (idx < 0 || idx >=size){
                System.out.println("Invalid arguments");
                return -1;
            }else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp= temp.next;
                }return temp.data;
            }
        }
    }
}
