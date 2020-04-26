package com.company.composition;

public class Vehicle {
    private int id;
    private String model;

    public Vehicle(int id, String model){
        this.id = id;
        this.model = model;
    }

    public int getId(){
        return this.id;
    }

    public String getModel(){
        return this.model;
    }
}
