package com.company.devices;

public class Phone extends Device {
    protected Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }
    @Override
    public void turnOn() { System.out.println("Hello"); }
}
