package com.ua.lesson18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class SaveNumbers {
    private int randomNumber;

    public int getRandomNumber() {
        return randomNumber;
    }

    private void setRandomNumber() {
        this.randomNumber = randomNumber;
    }

    public ArrayList<Integer> print10NumbersList() {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            a.add(generateNumbers());
        }
        return a;
    }

    private int generateNumbers() {
        Random random = new Random();
        this.randomNumber = random.nextInt(10, 21);
        return randomNumber;
    }
}

