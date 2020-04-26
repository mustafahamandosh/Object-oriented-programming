package com.company.inheritance.multiple;

public class Main {
    /**
     * Multiple Inheritance When a class is derived from more than one base class.
     * java supports multiple inheritance using interfaces not classes.
     */
    public static void main(String[] args) {
        System.out.println("Multiple Inheritance");
        Person john = new Person();
        john.father();
        john.mom();
    }
}
