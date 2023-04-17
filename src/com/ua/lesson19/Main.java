package com.ua.lesson19;

import java.util.*;

public class Main {
        public static void main(String[] args) {
            Numbers numbers = new Numbers();

            Set<Integer> set1 = new HashSet<>(numbers.print10000NumbersList());
            System.out.println(set1);

            Set<Integer> set2 = new LinkedHashSet<>(numbers.print10000NumbersList());
            System.out.println(set2);

            Set<Integer> set3 = new TreeSet<>(numbers.print10000NumbersList());
            System.out.println(set3);





    }
}