package com.ua.lesson26;

public class Main {
    static String square(int a) throws NegativeResult {
        int result = a * a;
        if (result < 0) {
            throw new NegativeResult();
        }
        return String.valueOf(result);

    }

    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.out.println(square(7));
        } catch (NegativeResult nr) {
            nr.printStackTrace();
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }
    }
}