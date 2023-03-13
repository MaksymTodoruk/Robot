package com.ua.lesson17;

public enum NewClass {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    private int numberOfTheDay;

    NewClass() {

    }

    NewClass(int numberOfTheDay) {
        this.numberOfTheDay = numberOfTheDay;
    }

    public int getNumberOfTheDay() {
        return numberOfTheDay;
    }

    public void findDay(int a) {
        this.numberOfTheDay = a;
        for (NewClass value : NewClass.values()) {
            if (this.numberOfTheDay == value.getNumberOfTheDay()) {
                System.out.println(value);
            }
        }
    }

}





