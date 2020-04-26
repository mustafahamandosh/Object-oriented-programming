package com.company.polymorphism;

public class Savings extends Account {
    private double interestRate = 0.8;

    public Savings(double balance){
        super(balance);
    }

    public void Withdraw(double amount){
        this.balance -= amount + (amount * interestRate);
    }

    public void Deposit(double amount){
        this.balance += amount + (amount * interestRate);
    }

    public void printBalance(){
        System.out.println("Balance in your saving account " + balance);
    }
}
