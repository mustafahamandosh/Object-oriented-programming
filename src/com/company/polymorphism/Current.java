package com.company.polymorphism;

public class Current extends Account{

    public Current(double balance) {
        super(balance);
    }

    public void Withdraw(double amount){
        this.balance -= amount;
    }

    public void Deposit(double amount){
        this.balance += amount;
    }

    public void printBalance(){
        System.out.println("Balance in your current account " + balance);
    }
}
