package com.ua.lesson15;

public class Pilot extends Human implements Fly{
    @Override
    public void fly() {
        System.out.println("Pilot fly");
    }

    @Override
    public void drive() {
        System.out.println("Pilot drive");
    }
}
