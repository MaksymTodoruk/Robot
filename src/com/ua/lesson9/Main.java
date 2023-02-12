package com.ua.lesson9;



public class Main {

    public static void main(String[] args) {
        Teacher alex = new Teacher();
        alex.setName("Aleksey");

        Student max = new Student();
        max.setName("Maksym");

        System.out.println("Teacher: " + alex + " Student " + max);

    }
}