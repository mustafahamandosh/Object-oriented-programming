package com.company.inheritance.hierarcall;

public class Main {
    /**
     * Hierarchical Inheritance When more than one classes inherit from the same class,
     */
    public static void main(String[] args) {
        System.out.println("Hierarchical Inheritance");
        Car toyota = new Car();
        toyota.setTopSpeed(200);

        Truck tesla = new Truck();
        tesla.setTopSpeed(1000);
    }
}
