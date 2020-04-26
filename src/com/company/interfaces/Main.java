package com.company.interfaces;

public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        Penguin penguin = new Penguin();

        parrot.eat();
        parrot.flying();

        penguin.eat();
        penguin.walk();
    }
}
