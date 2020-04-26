package com.company.composition;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4453, "Volvo s60");
        Driver driver = new Driver("John", vehicle);
        driver.printDetails();
    }
}
