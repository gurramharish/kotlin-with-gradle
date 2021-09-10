package com.hans.model;

public class CargoFlight extends Flight {
    int getSeats() { return  2; }

    public static void main(String[] args) {
        Flight f = new CargoFlight();
        f.addPassenger();
        f.addPassenger();
        f.addPassenger();
    }
}
