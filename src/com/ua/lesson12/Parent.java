package com.ua.lesson12;

public class Parent {
    static {
        System.out.println("static Parent block");
    }
    {
        System.out.println("Parent block 1");
    }
    {
        System.out.println("Parent block 2");
    }
    Parent(){
        System.out.println("Parent constructor");
    }

}
