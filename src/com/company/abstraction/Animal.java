package com.company.abstraction;

abstract class Animal {
    public abstract void makeSound();

    public void move(){
        System.out.println(getClass().getSimpleName() + " is moving");
        //getClass().getSimpleName() is an inbuilt functionality of Java
        //to get the class name from which the method is being called
    }
}
