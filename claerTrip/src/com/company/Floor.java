package com.company;

import java.util.List;

public class Floor {
    String floor;
    List<ConferenceRoom> list;
    public Floor(String floor,List<ConferenceRoom> list){
        this.floor = floor;
        this.list = list;
    }
    public  String createFLoor(String floor){
        return floor;
    }
    public boolean addRooms(ConferenceRoom room){
        return list.add(room);
    }
}
