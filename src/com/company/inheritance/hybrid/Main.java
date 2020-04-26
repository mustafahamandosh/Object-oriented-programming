package com.company.inheritance.hybrid;

public class Main {
    /**
     * Hybrid Inheritance is a combination of Multiple, Multi-level, and Hierarchical inheritance
     */
    public static void main(String[] args) {
        Person1 person = new Person1();
        person.single();
        person.multiLevel();
        person.hierarchical();
        Person2 person2 = new Person2();
        person2.hierarchical();
        System.out.println();
        person.multipleGrandMom();
        person.multipleUncle();
    }
}
