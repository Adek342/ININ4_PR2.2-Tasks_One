package com.company.devices;

public abstract class Device {
    final public String producer;
    final public String model;
    final public Integer yearOfProduction;

    protected Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() { return producer + " " + model + " " + " " + yearOfProduction;}

    public abstract void turnOn();
}
