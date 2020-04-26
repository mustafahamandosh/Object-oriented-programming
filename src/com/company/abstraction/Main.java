package com.company.abstraction;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
        animal.move();

        animal = new Cat();
        animal.makeSound();
        animal.move();
    }
}
