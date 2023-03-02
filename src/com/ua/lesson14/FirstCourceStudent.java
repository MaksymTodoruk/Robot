package com.ua.lesson14;

public class FirstCourceStudent extends  Student{
    @Override
    void studying() {
        System.out.println("Student studying");
    }
    FirstCourceStudent(String gender, int age){
        setGender(this.gender);
        setAge();
    }

    @Override
    public String toString() {
        return "FirstCourceStudent{" +
                "gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
