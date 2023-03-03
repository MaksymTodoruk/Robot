package com.ua.lesson14;

public class FirstCourceStudent extends  Student{
    @Override
    void studying() {
        System.out.println("Student studying");
    }
    FirstCourceStudent(){}
    FirstCourceStudent (int age, String gender){
        setAge(age);
        setGender(gender);
    }

    public String toString() {
        return "FirstCourceStudent{" +
                "age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                '}';
    }

}
