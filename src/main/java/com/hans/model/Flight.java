package com.hans.model;

public class Flight {
    int getSeats() { return 3; }
    int passengers = 0;

    public void addPassenger() {
        if(hasSeating()) {
            System.out.println("Adding passenger to flight!!");
            passengers++;
        } else {
            System.out.println("Seats full!!");
        }
    }

    private boolean hasSeating() {
        return passengers < getSeats();
    }
}
