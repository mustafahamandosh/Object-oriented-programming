package com.company.inheritance.hybrid;

public class Father extends GrandFather implements GranMother, Uncle {
    public void single(){
        System.out.println("Single Inheritance from father");
    }

    public void multiLevel() {
        super.grandFather();
    }

    public void hierarchical(){
        System.out.println("Hierarchical Inheritance");
    }

    @Override
    public void multipleGrandMom() {
        System.out.println("Multiple Inheritance from grand mom");
    }

    @Override
    public void multipleUncle() {
        System.out.println("Multiple Inheritance from uncle");
    }
}
