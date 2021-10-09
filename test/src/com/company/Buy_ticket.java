package com.company;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Buy_ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        Queue<Integer> stack = new LinkedList<>();
        for (int i=0;i<test;i++){
            String inp = sc.next();

            if (inp.equals("E")){
                stack.add(sc.nextInt());
                System.out.println(stack.size());
            }else {
                int pri = stack.isEmpty() ?-1 :stack.peek();
                if (stack.size()>0)stack.remove();
                System.out.println(pri+" "+stack.size());
            }
        }
    }
}
