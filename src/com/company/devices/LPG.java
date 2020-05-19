package com.company.devices;

public class LPG extends Car {
    public LPG(String producer, String model, Integer yearOfProduction, Double engineCapacity, String colour, Double value) {
        super(producer, model, yearOfProduction, engineCapacity, colour, value);
    }

    @Override
    public void refuel() { }
}
