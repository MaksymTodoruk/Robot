package com.ua.lesson23;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Students> studentsList = new ArrayList<>();
        studentsList.add(new Students("Todoruk"));
        studentsList.add(new Students("Todoruk"));
        studentsList.add(new Students("Vashchuk"));
        studentsList.add(new Students("Vashchuk"));
        studentsList.add(new Students("Vashchuk"));
        studentsList.add(new Students("Vashchuk"));
        studentsList.add(new Students("Kobzev"));
        studentsList.add(new Students("Kobzev"));
        studentsList.add(new Students("Todoruk"));
        studentsList.add(new Students("Kobzev"));
        studentsList.add(new Students("Todoruk"));
        studentsList.add(new Students("Kobzev"));
        studentsList.add(new Students("Satsyk"));
        studentsList.add(new Students("Satsyk"));
        studentsList.add(new Students("Satsyk"));
        studentsList.add(new Students("Todoruk"));
        studentsList.add(new Students("Satsyk"));
        studentsList.add(new Students("Nipruk"));
        studentsList.add(new Students("Nipruk"));
        studentsList.add(new Students("Nipruk"));

        System.out.println(studentsList);

        Map<String, Long> studentsMap = studentsList.stream()
                .collect(Collectors.groupingBy(Students::getSurname, Collectors.counting()));

        System.out.println(studentsMap);

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int x = random.nextInt(1, 11);
            integerList.add(x);
        }

        System.out.println(integerList);

        Integer result = integerList.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(result);


    }
}