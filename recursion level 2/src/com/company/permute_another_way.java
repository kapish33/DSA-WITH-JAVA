package com.company;

import java.util.Scanner;

public class permute_another_way {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_boxes = sc.nextInt();
        int r_selecction = sc.nextInt();
        permutation(1,n_boxes,new int[r_selecction],0,r_selecction,"");
    }
    public static void permutation(int current_box,int total_spots,int[] used_items,int selection_so_far,int total_selection,String asn){
        if (current_box >total_spots){
            if (selection_so_far==total_selection){
                System.out.println(asn);
            }return;
        }

        for (int i = 0; i < total_spots; i++) {
            if (used_items[i]==0) {
                used_items[i]=1;
                permutation(current_box+1, total_spots, used_items, selection_so_far+1, total_selection, asn+(i+1));
                used_items[i]=0;
            }
            permutation(current_box+1, total_spots, used_items, selection_so_far, total_selection, asn+0);

        }
    }
}
