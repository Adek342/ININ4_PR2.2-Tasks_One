package com.company.devices;

import com.company.Human;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public abstract class Car extends Device {
    final public Double engineCapacity;
    public String colour;
    public Double value;
    Scanner scan = new Scanner(System.in);
    int buyerParking = 0;
    int sellerParking;

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
    public void turnOn() {
        System.out.println("engine is on");
    }

    @Override
    public void sell(Human Buyer, Human Seller, Double Price) throws Exception {
        if (this == null)
            throw new Exception("This place is empty");
        System.out.println("Which car for sale?");
        sellerParking = scan.nextInt();
        if (Buyer.getCash() >= Price && Seller.getCar(sellerParking) == this) {
            System.out.println("Buyer: " + Buyer);
            System.out.println("Seller: " + Seller);
            System.out.println("Before transaction: " + Buyer + ": " + Buyer.getCash());
            System.out.println("Before transaction " + Seller + ": " + Seller.getCash());
            Buyer.setCash(Buyer.getCash() - Price);
            Seller.setCash(Seller.getCash() + Price);
            System.out.println("After transaction: " + Buyer + ": " + Buyer.getCash());
            System.out.println("After transaction " + Seller + ": " + Seller.getCash());
            //TUUUUUUUUUUUUUUUUU
            while (Buyer.getCar(buyerParking) != null) {
                if (Buyer.getCar(buyerParking) == null) {
                    break;
                }
                if ((Buyer.garage.length - 1) == buyerParking && Buyer.getCar(Buyer.garage.length - 1) != null) {
                    throw new Exception("All parking spaces are occupied");
                }
                buyerParking = buyerParking + 1;
            }
            if (Buyer.getCar(buyerParking) == null) {
                Buyer.setCar(buyerParking, this);
                Seller.setCar(sellerParking, null);

                System.out.println("Transaction was successful");
            }
        } else throw new

                Exception("You don't have cash");
    }


    public abstract void refuel();
}
