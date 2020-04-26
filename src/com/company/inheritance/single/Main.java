package com.company.inheritance.single;

public class Main {
    /**
     * In single inheritance, there is only a single class extending from another class. We can take the example of the
     * Vehicle class (Super class) and the Car class (Sub class).
     */
    public static void main(String[] args) {
        System.out.println("Single Inheritance");
        Car toyota = new Car();
        toyota.setTopSpeed(220);
        toyota.openTrunk();
    }
}
