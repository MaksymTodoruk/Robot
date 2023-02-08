package com.ua.lesson8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] minArray = {6, 6, 4, 8, 7, 9};
        doArray(array);
        System.out.println(getMinFromArray(minArray));
        System.out.println(getMaxFromArray(minArray));
        System.out.println(averageValue(minArray));
        System.out.println(sumOfElements(minArray));
    }

    static int[] doArray(int[] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            int x = random.nextInt(10) + 1;
            a[i] = x;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        return a;
    }

    static int getMinFromArray(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] == min){
                min = min;
            }
        }
        return min;
    }

    static int getMaxFromArray(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] == max){
                max = max;
            }
        }
        return max;
    }

    static double averageValue(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double average = (double) sum / a.length;
        return average;
    }

    static double sumOfElements(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }
}