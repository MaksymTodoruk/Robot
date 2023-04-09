package com.ua.lesson23;
import java.util.Comparator;

public class Students implements Comparable<Students> {
    private String surname;

    public Students(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Students{" +
                "surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        return 0;
    }
}
