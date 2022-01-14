package com.company;

public class NthNodeFromENd {

class Node{
  int data;
  Node next;

  Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  Node(int data){
    this.data = data;
    this.next = null;
  }
  Node(){
    this.data = 0;
    this.next = null;
  }
}


    class Solution{
        public int nthNode(Node head,int n){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            if(count<n){
                return -1;
            }
            temp = head;
            for(int i=0;i<count-n;i++){
                temp = temp.next;
            }
            return temp.data;
        }
    }

}
