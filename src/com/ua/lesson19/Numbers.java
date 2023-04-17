package com.ua.lesson19;

import java.util.ArrayList;
import java.util.Random;

public class Numbers {
    private int randomNumber;

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public ArrayList<Integer> print10000NumbersList() {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            a.add(generateNumbers());
        }
        return a;
    }

    private int generateNumbers() {
        Random random = new Random();
        this.randomNumber = random.nextInt(1, 51);
        return randomNumber;
    }

    @Override
    public String toString() {
        return "Numbers{}";
    }
}