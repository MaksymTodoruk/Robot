package com.ua.lesson14;

public class Main {
    public static void main(String[] args) {
        JavaTeacher alex = new JavaTeacher("male", 30);
        FirstCourceStudent max = new FirstCourceStudent("male", 35);

        System.out.println(alex);
        System.out.println(max);

        alex.teaching();
        max.studying();
    }
}
