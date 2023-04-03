package com.ua.lesson22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 100));
        students.add(new Student("Max", 95));
        students.add(new Student("Andrew", 90));

        System.out.println("Original List: " + students);

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getSurname().compareTo(o2.getSurname());
//            }
//        });
//        System.out.println(students);

        Collections.sort(students, (o1, o2) -> o1.getSurname().compareTo(o2.getSurname()));
        System.out.println(students);

        Collections.sort(students, Comparator.comparing(Student::getAverageScore));
        System.out.println(students);


    }
}
