package com.ua.lesson7;

public class Main {
    public static void main(String[] args) {
        int number = 15;
        String text = "r";
        System.out.println(cube(number));
        printStars(number);
        printNumberOfSigns(text, number);
    }

    static int cube(int a) {
        return a = a * a * a;
    }

    static void printStars(int a) {
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void printNumberOfSigns(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.print(a);
        }
        System.out.println();
    }
}
