package com.company.inheritance.multiple;

public class Person implements Father, Mother {
    @Override
    public void father() {
        System.out.println("Inherited from my father");
    }

    @Override
    public void mom() {
        System.out.println("Inherited from my mother");
    }
}
