package com.company.composition;

public class Driver {
    private String driverName;
    private Vehicle vehicle;

    public Driver(String name, Vehicle vehicle){
        this.driverName = name;
        this.vehicle = vehicle;
    }

    public void printDetails(){
        System.out.println("Name " + driverName + ", Vehicle " + vehicle.getId() + ": " + vehicle.getModel());
    }
}
