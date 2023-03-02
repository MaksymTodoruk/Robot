package com.ua.lesson14;

public class Main {
    public static void main(String[] args) {
        UniversityPerson alex = new JavaTeacher(20, "male");
        UniversityPerson max = new FirstCourceStudent(30, "male");

        System.out.println(alex.getAge());
        System.out.println(alex.getGender());

        System.out.println(max.getAge());
        System.out.println(max.getGender());

        System.out.println(alex.toString());
        System.out.println(max.toString());

    }

}
