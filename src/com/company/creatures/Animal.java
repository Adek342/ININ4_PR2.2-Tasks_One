package com.company.creatures;

import com.company.Human;
import com.company.Salleable;

public abstract class Animal implements Salleable {
    public final String species;
    public String name;
    protected Double weight;

    public static final Double DEAFAULT_DOG_WEIGHT = 10.0;
    public static final Double DEAFAULT_MOUSE_WEIGHT = 0.01;
    public static final Double DEAFAULT_LION_WEIGHT = 123.0;

    public Animal(String species) {
        this.species = species;
        if (species == "dog") {
            this.weight = DEAFAULT_DOG_WEIGHT;
        } else if (species == "mouse") {
            this.weight = DEAFAULT_MOUSE_WEIGHT;
        } else if (species == "lion") {
            this.weight = DEAFAULT_LION_WEIGHT;
        }
    }

    public void feed() {
        if (weight > 0.0) {
            weight++;
            System.out.println("thx for food bro, " + weight + "kg");
        } else {
            System.out.println("Man! Your dog is dead you cannot feed him");
        }
    }

    public void takeForAWalk() {
        weight--;
        if (weight > 0.0) {
            System.out.println("thx for taking me for walk, " + weight + "kg");
        } else {
            System.out.println("Man! Your dog is dead you cannot take him for a walk");
        }
    }

    @Override
    public String toString() {
        return name + " " + species + " " + weight + "kg";

    }

    @Override
    public void sell(Human Buyer, Human Seller, Double Price) {
        if(Buyer.getCash() >= Price && Seller.pet == this)
        {
            System.out.println("Buyer: " + Buyer);
            System.out.println("Seller: " + Seller);
            System.out.println("Before transaction: " + Buyer + ": " + Buyer.getCash());
            System.out.println("Before transaction " + Seller + ": " + Seller.getCash());
            Buyer.setCash(Buyer.getCash() - Price);
            Seller.setCash(Seller.getCash() + Price);
            System.out.println("After transaction: " + Buyer + ": " + Buyer.getCash());
            System.out.println("After transaction " + Seller + ": " + Seller.getCash());
            Buyer.pet = this;
            Seller.pet = null;
        } else System.out.println("I'm sorry, you can't do this");
    }
}
