package com.ua.lesson9;



public class Main {

    public static void main(String[] args) {
        Teacher alex = new Teacher();  // Use default constructor
        alex.setName("Aleksey");

        Student max = new Student();
        max.setName("Maksym");

        Teacher andrii = new Teacher(15, "Java"); // Use constructor with parameters

        System.out.println("Teacher: " + alex.getName() + "; Student: " + max.getName());
        System.out.println(alex);
        System.out.println(andrii.getNumOfClasses() + " " + andrii.getSubject());
        System.out.println(andrii);

        HomeWork9 one = new HomeWork9();
        one.setRandomArray(new int[10]);        // Define new int array
        one.randomArr(one.getRandomArray());

        HomeWork9 two = new HomeWork9();
        two.setRandomArray(new int[]{5, 2, 7, 4, 3, 8, 9, 11});
        two.sortToMax(two.getRandomArray());        // Sort from min to max

        HomeWork9 three = new HomeWork9();
        three.setRandomArray(new int[] {6, 12, 15, 2, 11, 8, 7, 6, 3});
        three.sortToMin(three.getRandomArray());    // Sort from max to min
    }
}