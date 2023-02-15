package com.ua.lesson9;

import java.util.Arrays;
import java.util.Random;

public class HomeWork9 {

    private int[] randomArray;

    public int[] getRandomArray() {
        return randomArray;
    }

    public void setRandomArray(int[] randomArray) {
        this.randomArray = randomArray;
    }

    public int[] randomArr(int[] size) {
        this.randomArray = size;
        Random random = new Random();
        for (int i = 0; i < size.length; i++) {
            size[i] = random.nextInt(30) + 1;
            System.out.print(size[i] + " ");
        }
        System.out.println();
        return size;
    }

    public int[] sortToMax(int[] arr) {
        this.randomArray = arr;
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public int[] sortToMin(int[] arr) {
        this.randomArray = arr;
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    isSorted = false;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}





