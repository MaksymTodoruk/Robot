package com.ua.lesson22;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String Surname;
    private int AverageScore;

    public Student(String surname, int averageScore) {
        Surname = surname;
        AverageScore = averageScore;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAverageScore() {
        return AverageScore;
    }

    public void setAverageScore(int averageScore) {
        AverageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Surname='" + Surname + '\'' +
                ", AverageScore=" + AverageScore +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
