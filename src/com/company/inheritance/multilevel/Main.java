package com.company.inheritance.multilevel;

public class Main {
    /**
     * Multi-level Inheritance is a class which derived from such a class which itself is derived from another class.
     */
    public static void main(String[] args) {
        System.out.println("Multi-level Inheritance");
        Toyota toyota = new Toyota();
        toyota.setTopSpeed(200);
        toyota.openTrunk();
        toyota.turnOnHybrid();
    }
}
