package com.company.devices;

import com.company.Human;

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

    @Override
    public void sell(Human Buyer, Human Seller, Double Price) {
        if(Buyer.getCash() >= Price && Seller.getCar() == this)
        {
            System.out.println("Buyer: " + Buyer);
            System.out.println("Seller: " + Seller);
            System.out.println("Before transaction: " + Buyer + ": " + Buyer.getCash());
            System.out.println("Before transaction " + Seller + ": " + Seller.getCash());
            Buyer.setCash(Buyer.getCash() - Price);
            Seller.setCash(Seller.getCash() + Price);
            System.out.println("After transaction: " + Buyer + ": " + Buyer.getCash());
            System.out.println("After transaction " + Seller + ": " + Seller.getCash());
            Buyer.setCar(this);
            Seller.setCar(null);

        } else System.out.println("I'm sorry, you can't do this");
    }
}
