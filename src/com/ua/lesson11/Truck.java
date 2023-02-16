package com.ua.lesson11;

public class Truck extends Car {
    private String truck;
    @Override
    public String driveTheCar(String a) {
        this.truck = "Truck`s method: " + a;
        return truck;
    }
}
