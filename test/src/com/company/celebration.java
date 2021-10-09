package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class celebration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0;i<test;i++){
            int inpput = sc.nextInt();

            if (inpput==1) queue.add(sc.nextInt());
            else if (inpput==2) stack.push(sc.nextInt());
            else if (inpput==3) {
                int pri = queue.size()>0 ? queue.peek() : -1;
                System.out.println(pri);
            }
            else if (inpput==4) {
                int pri = stack.size()>0 ? stack.peek() : -1;
                System.out.println(pri);
            }
            else {
                if (queue.size()>0 && stack.size()>0){
                    stack.push(queue.peek());
                    queue.remove();
                }else System.out.println(-1);
            }
        }
    }
}
