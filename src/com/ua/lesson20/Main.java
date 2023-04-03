package com.ua.lesson20;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TranslatedMonths one = new TranslatedMonths("January", "1月", "Januar");
        TranslatedMonths two = new TranslatedMonths("February", "2月", "Februar");
        TranslatedMonths three = new TranslatedMonths("March", "3月", "März");
        TranslatedMonths four = new TranslatedMonths("April", "4月", "April");
        TranslatedMonths five = new TranslatedMonths("May", "5月", "Mai");
        TranslatedMonths six = new TranslatedMonths("June", "6月", "Juni");
        TranslatedMonths seven = new TranslatedMonths("July", "7月", "Juli");
        TranslatedMonths eight = new TranslatedMonths("August", "8月", "August");
        TranslatedMonths nine = new TranslatedMonths("September", "9月", "September");
        TranslatedMonths ten = new TranslatedMonths("October", "10月", "Oktober");
        TranslatedMonths eleven = new TranslatedMonths("November", "11月", "November");
        TranslatedMonths twelve = new TranslatedMonths("December", "12月", "Dezember");

        Map<String, TranslatedMonths> map = new HashMap<>();
        map.put("Січень", one);
        map.put("Лютий", two);
        map.put("Березень", three);
        map.put("Квітень", four);
        map.put("Травень", five);
        map.put("Червень", six);
        map.put("Липень", seven);
        map.put("Серпень", eight);
        map.put("Вересень", nine);
        map.put("Жовтень", ten);
        map.put("Листопад", eleven);
        map.put("Грудень", twelve);
        System.out.println(map.get("Вересень"));

    }
}
