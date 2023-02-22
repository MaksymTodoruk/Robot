package com.ua.lesson12;

public class Child extends Parent {
    static {
        System.out.println("static Child block");
    }

    {
        System.out.println("Child block 1");
    }

    {
        System.out.println("Child block 2");
    }
    Child() {
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        new Parent();
        new Child();
    }
}
