package com.company;

public class reverse_a_linkedList {
class Node{
  int data;
  Node next;

  public Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
  public Node(){
    this.data = 0;
    this.next = null;
  }
}

    class Solution{
        public static Node reverseLinkedList(Node a){
            //write your code here.
            Node prev = null;
            Node curr = a;
            Node next = null;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;

        }
    }

}
