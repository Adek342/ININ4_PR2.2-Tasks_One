package com.company.devices;

import com.company.Human;

import java.util.*;
import java.util.concurrent.CompletionService;

public abstract class Car extends Device {
    final public Double engineCapacity;
    public String colour;
    public Double value;
    public int sellerParking;
    public List<Human> listOfOwners = new ArrayList<>();
    public int numberOfOwners = 0;
    public int  numberOfSales = 0;

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
        if (Buyer.getCash() >= Price && Seller.getCar(sellerParking) == this) {
            System.out.println("Buyer: " + Buyer);
            System.out.println("Seller: " + Seller);
            System.out.println("Before transaction: " + Buyer + ": " + Buyer.getCash());
            System.out.println("Before transaction " + Seller + ": " + Seller.getCash());
            Buyer.setCash(Buyer.getCash() - Price);
            Seller.setCash(Seller.getCash() + Price);
            System.out.println("After transaction: " + Buyer + ": " + Buyer.getCash());
            System.out.println("After transaction " + Seller + ": " + Seller.getCash());
            numberOfSales++;
            //TUUUUUUUUUUUUUUUUU
            for (int i = 0; i < Buyer.garage.length; i++) {
                if (Buyer.getCar(i) == null) {
                    Buyer.setCar(i, Seller.getCar(sellerParking));
                    Seller.setCar(sellerParking, null);
                    System.out.println("Transaction was successful");
                    break;
                }
                if ((Buyer.garage.length - 1) == i && Buyer.getCar(Buyer.garage.length - 1) != null) {
                    throw new Exception("All parking spaces are occupied");
                }
            }
        } else throw new
                Exception("You don't have cash");
    }

    public List<Human> showOwnerList()
    {
        if(listOfOwners.size() == 0){
            System.out.println("The car did not yet have an owner");}
        else
        System.out.println(listOfOwners);
        return listOfOwners;
    }

    public void transactionHistory()
    {
        if(listOfOwners.size() == 0){
            System.out.println("No transactions have been made on this car yet");
        }else {
            for (int i = 0; i < listOfOwners.size() - 1; i++) {
                System.out.println("[["+listOfOwners.get(i)+"]]" + "SELL CAR TO" + "[["+ listOfOwners.get(i + 1)+"]]");
            }
        }
    }

    public int getNumberOfSales() {
        System.out.println("Number of Sales: "+ numberOfSales);
        return numberOfSales;
    }

    public abstract void refuel();
}

