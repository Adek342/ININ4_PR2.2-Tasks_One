package com.company.devices;

public class Diesel extends Car {
    public Diesel(String producer, String model, Integer yearOfProduction, Double engineCapacity, String colour, Double value) {
        super(producer, model, yearOfProduction, engineCapacity, colour, value);
    }

    @Override
    public void refuel() { }
}
