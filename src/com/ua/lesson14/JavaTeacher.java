package com.ua.lesson14;

public class JavaTeacher extends Teacher {
    @Override
    void teaching() {
        System.out.println("Start teaching");
    }
    JavaTeacher() {
    }
    JavaTeacher(int age, String gender) {
        setAge(age);
        setGender(gender);
    }

    @Override
    public String toString() {
        return "JavaTeacher{" +
                "age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                '}';
    }
}
