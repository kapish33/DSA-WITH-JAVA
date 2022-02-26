package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConferenceRoom conf_Room = new ConferenceRoom("room1",1,2);
        ArrayList<ConferenceRoom> arrayList = new ArrayList<>();
        arrayList.add(conf_Room);
        Floor floor = new Floor("floor1",arrayList);
        Building building = new Building(floor);
        Stuf();
    }
    public  static void Stuf(){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (true){
            if (i<2){
                System.out.println("Choices : ");
                System.out.println("ADD BUILDING <building> : 1 ");
                System.out.println("ADD FLOOR <building> <floor>: 2");
                System.out.println("ADD CONFROOM <building> <floor> <conferenceRoomID> : 3");
                System.out.println("for any key to break 4 ");
                i++;
            }
            int waht = sc.nextInt();
            String room = "";
            int Start = 0;
            int end = 0;
            ConferenceRoom conf_Room;
            ArrayList<ConferenceRoom> arrayList;
            Floor floor = new Floor("",new ArrayList<>());
            Building building = new Building(new Floor("",new ArrayList<>()));
            switch (waht){
                case 1 :{
                    building= new Building(new Floor(sc.next(),new ArrayList<>()));
                } case 2 :{
                    floor = new Floor(sc.next(), new ArrayList<>());
                } case 3 :{
                    building = new Building(new Floor(sc.next(), new ArrayList<>()));
                } default: break;
            }
        }
    }

}
