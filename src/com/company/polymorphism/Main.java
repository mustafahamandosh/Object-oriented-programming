package com.company.polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(2));
        shapes.add(new Rectangle(2,2));

        for (Shape shape : shapes){
            System.out.println("Area: " + shape.getArea());
        }

        Account account = new Savings(50000);
        account.Deposit(1000);
        account.printBalance();
        account.Withdraw(3000);
        account.printBalance();

        account = new Current(50000);
        account.Deposit(1000);
        account.printBalance();
        account.Withdraw(3000);
        account.printBalance();
    }
}
