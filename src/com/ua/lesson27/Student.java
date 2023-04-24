package com.ua.lesson27;

import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {
    private String name;
    private int age;
    private String[] lessons;

    public Student(String name, int age, String[] lessons) {
        this.name = name;
        this.age = age;
        this.lessons = lessons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getLessons() {
        return lessons;
    }

    public void setLessons(String[] lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", lessons=" + Arrays.toString(lessons) +
                '}';
    }
}
