package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class palyers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        Coding_conpletion(times);
    }
    public static void Coding_conpletion(int times){
        // master + Q1,Q2,Q3,Q4
        Scanner sc = new Scanner(System.in);
        Queue<Integer> MasterQueue = new LinkedList<>();
        Queue<Integer> Queue1 = new LinkedList<>();
        Queue<Integer> Queue2 = new LinkedList<>();
        Queue<Integer> Queue3 = new LinkedList<>();
        Queue<Integer> Queue4 = new LinkedList<>();

        boolean flag1 = false,flag2 = false,flag3 = false,flag4 = false;
        for (int i =0;i<times;i++){
            String sam = sc.next();
            if (sam.equals("E")){
                int input = sc.nextInt();
                if (input==1){
                    flag1=true;
                    func__E(MasterQueue,Queue1,Queue2,Queue3,Queue4);
                }
                else if (input==2){
                    flag2=true;
                    func__E(MasterQueue,Queue1,Queue2,Queue3,Queue4);
                }
                else if (input == 3){
                    flag3=true;
                    func__E(MasterQueue,Queue1,Queue2,Queue3,Queue4);
                }
                else if (input == 4) {
                    flag4=true;
                    func__E(MasterQueue,Queue1,Queue2,Queue3,Queue4);
                }
            }
            else {
                int to_remove =  MasterQueue.peek();
                if (to_remove==1){
                    if (Queue1.size()>1){
                        System.out.println(to_remove+" "+Queue1.peek());
                        Queue1.remove();
                    }else {
                        System.out.println(to_remove+" "+Queue1.peek());
                        Queue1.remove();
                        MasterQueue.remove();
                    }
                }
                else  if (to_remove==2){
                    if (Queue2.size()>1){
                        System.out.println(to_remove+" "+Queue2.peek());
                        Queue2.remove();
                    }else {
                        System.out.println(to_remove+" "+Queue2.peek());
                        Queue2.remove();
                        MasterQueue.remove();
                    }
                }else  if (to_remove==3){
                    if (Queue3.size()>1){
                        System.out.println(to_remove+" "+Queue3.peek());
                        Queue3.remove();
                    }else {
                        System.out.println(to_remove+" "+Queue3.peek());
                        Queue3.remove();
                        MasterQueue.remove();
                    }
                }
                else if (to_remove==4){
                    if (Queue4.size()>1){
                        System.out.println(to_remove+" "+Queue4.peek());
                        Queue4.remove();
                    }else {
                        System.out.println(to_remove+" "+Queue4.peek());
                        Queue4.remove();
                        MasterQueue.remove();
                    }
                }
            }
        }
    }
    public static void func__E(Queue<Integer> MasterQueue,Queue<Integer> Queue1,Queue<Integer> Queue2,Queue<Integer> Queue3,Queue<Integer> Queue4){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        MasterQueue.add(n1);
        if (n1==1) Queue1.add(n2);
        else if (n1==2) Queue2.add(n2);
        else if (n1==3) Queue3.add(n2);
        else Queue4.add(n2);
    }
}
