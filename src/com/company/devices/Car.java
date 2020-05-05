package com.company.devices;

public class Car {
    final public String mark;
    final public String model;
    final public Integer yearOfProduction;
    final public Double engineCapacity;
    public String colour;
    public Double value;

    public Car(String mark, String model, Integer yearOfProduction, Double engineCapacity, String colour, Double value) {
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        this.colour = colour;
        this.value = value;
    }

    public String toString() {
        return mark + " " + model + " " + " " + yearOfProduction;
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
        return mark.equals(car.mark) &&
                model.equals(car.model) &&
                yearOfProduction.equals(car.yearOfProduction) &&
                engineCapacity.equals(car.engineCapacity) &&
                colour.equals(car.colour) &&
                value.equals(car.value);
    }
}
