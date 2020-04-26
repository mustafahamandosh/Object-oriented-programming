package com.company.inheritance.hybrid;

public class Person2 extends Father {
    @Override
    public void hierarchical() {
        super.hierarchical();
        System.out.println("Person 2");
    }
}
