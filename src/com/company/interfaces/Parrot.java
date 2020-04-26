package com.company.interfaces;

public class Parrot extends Bird implements CanFly {

    @Override
    public void flying() {
        System.out.println("Parrot is flying");
    }

}
