package com.ua.lesson15;

public class Main {
    public static void main(String[] args) {
        Human driver1 = new Driver();
        driver1.drive();

        Human human1 = new Human();
        human1.drive();

        Pilot pilot1 = new Pilot();
        pilot1.fly();
        pilot1.drive();
    }

}
