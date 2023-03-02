package com.ua.lesson14;

public class JavaTeacher extends Teacher{
    @Override
    void teaching() {
        System.out.println("Start teaching");
    }

    JavaTeacher (String gender, int age){

    }

    @Override
    public String toString() {
        return "JavaTeacher{" +
                "gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
