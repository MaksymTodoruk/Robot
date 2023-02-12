package com.ua.lesson9;

import java.util.Random;

public class HomeWork9 {
    private int[] array;
    private int arraySize;

    public static void main(String[] args) {



    }
    public static int[] randomArr (int[] size) {
        Random random = new Random();
        for (int i = 0; i < size.length; i++) {
            int x = random.nextInt(30) + 1;
           size[i] = x;
        }
        return size;
    }

}
