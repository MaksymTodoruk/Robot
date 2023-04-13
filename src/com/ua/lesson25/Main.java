package com.ua.lesson25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Put your number");
                int number = scanner.nextInt();
                System.out.println("Your number is: " + number);
            } catch (NumberFormatException e) {
            }
        }
    }
}
