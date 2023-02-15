package com.ua.lesson9;

public class Student{
private String name;
private int age;
private int course;
private int numOfClasses;
private boolean dorm;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", numOfClasses=" + numOfClasses +
                ", dorm=" + dorm +
                '}';
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getNumOfClasses() {
        return numOfClasses;
    }

    public void setNumOfClasses(int numOfClasses) {
        this.numOfClasses = numOfClasses;
    }

    public boolean isDorm() {
        return dorm;
    }

    public void setDorm(boolean dorm) {
        this.dorm = dorm;
    }
}
