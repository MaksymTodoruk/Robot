package com.ua.lesson18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SaveNumbers save = new SaveNumbers();
        System.out.println(save.print10NumbersList());  // Save 10 random int elements invoking by the method;

        List<String> a = new ArrayList<>();
        a.add("dfgdg");
        a.add("hjdfgsd");
        a.add("13vnvn");
        a.add("#ghhf");
        a.add("Sdrrr");
        System.out.println(a);
        Collections.sort(a);                            // sorting with "natural order"
        System.out.println(a);

        List linked = new LinkedList();
        for (int i = 0; i < 2000000; i++) {
            linked.add(new Student());
  //        System.out.println(linked);                 // LinkedList of 2000000 Student objects
        }
    }
}
