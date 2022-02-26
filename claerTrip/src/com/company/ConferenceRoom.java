package com.company;

public class ConferenceRoom {
    String Room;
    int startTime;
    int endTime;
    public ConferenceRoom(String Room,int startTime, int endTime){
        this.Room =Room;
        this.startTime =startTime;
        this.endTime =endTime;
    }
    public String conferenceRoom(String Room,boolean booked){
        return Room;
    }
    public boolean checkInCheckOut(int startTime,int endTime){
        if (endTime<startTime) return false;
        else if (endTime>24 || startTime>24) return false;
        else return endTime - startTime <= 12;
    }
}
