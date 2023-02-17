package com.ua.lesson11;

public class PassengerCar extends Car {
    private String passengerCar;
    @Override
    public String driveTheCar(String a) {
        this.passengerCar = "Passenger`s car method: " + a;
        return passengerCar;
    }
}
