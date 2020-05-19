package com.company.devices;

public class Car extends Device {
    final public Double engineCapacity;
    public String colour;
    public Double value;

    public Car(String producer, String model, Integer yearOfProduction, Double engineCapacity, String colour, Double value) {
        super(producer, model, yearOfProduction);
        this.engineCapacity = engineCapacity;
        this.colour = colour;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return producer.equals(car.producer) &&
                model.equals(car.model) &&
                yearOfProduction.equals(car.yearOfProduction) &&
                engineCapacity.equals(car.engineCapacity) &&
                colour.equals(car.colour) &&
                value.equals(car.value);
    }

    @Override
    public void turnOn() { System.out.println("engine is on"); }
}
