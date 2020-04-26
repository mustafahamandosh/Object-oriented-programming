package com.company.inheritance.hybrid;


public class Person1 extends Father {
    @Override
    public void single() {
        super.single();
    }

    @Override
    public void hierarchical() {
        super.hierarchical();
        System.out.println("Person 1");
    }


}
