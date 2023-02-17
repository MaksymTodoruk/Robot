package com.ua.lesson11;

public class Car {
    private String car;
    public String driveTheCar(String a) {
        this.car = "Car`s method: " + a;
        return car;
    }
    public static void main(String[] args) {
        Car car = new Car();
        PassengerCar passenger = new PassengerCar();
        Car truck = new Truck();

        System.out.println(car.driveTheCar("Any type of Car"));
        System.out.println(passenger.driveTheCar("Passenger car is Audi"));
        System.out.println(truck.driveTheCar("Truck is MAN"));
    }
}
