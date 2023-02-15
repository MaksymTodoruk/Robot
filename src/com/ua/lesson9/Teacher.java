package com.ua.lesson9;

public class Teacher {
    private String name;
    private String subject;
    private String university;
    private int numOfClasses;
    private  String degree;

    public Teacher(){

    }
    public Teacher(int a, String b) {
        this.numOfClasses = a;
        this.subject = b;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", university='" + university + '\'' +
                ", numOfClasses=" + numOfClasses +
                ", degree='" + degree + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getNumOfClasses() {
        return numOfClasses;
    }

    public void setNumOfClasses(int numOfClasses) {
        this.numOfClasses = numOfClasses;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
