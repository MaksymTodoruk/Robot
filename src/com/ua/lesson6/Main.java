package com.ua.lesson6;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            if (i == 100)
                System.out.println();
        }

        int f = 1;
        int number = 7;
        for (int i = 1; i <= number; i++) {
            f = f * i;
        }
        System.out.println("factorial 7: " + f);

        int data = 100, fib1 = 0, fib2 = 1;
        for (int i = 1; i <= data; i++) {
            while (fib1 <= data) {
                System.out.print(fib1 + " ");
                int temp = fib1 + fib2;
                fib1 = fib2;
                fib2 = temp;
            }
        }
    }
}