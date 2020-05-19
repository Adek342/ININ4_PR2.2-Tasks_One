package com.company.devices;

import com.company.Human;

public class Phone extends Device {
    protected Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }
    @Override
    public void turnOn() { System.out.println("Hello"); }

    @Override
    public void sell(Human Buyer, Human Seller, Double Price) {
        if(Buyer.getCash() >= Price && Seller.getPhone() == this)
        {
            System.out.println("Buyer: " + Buyer);
            System.out.println("Seller: " + Seller);
            System.out.println("Before transaction: " + Buyer + ": " + Buyer.getCash());
            System.out.println("Before transaction " + Seller + ": " + Seller.getCash());
            Buyer.setCash(Buyer.getCash() - Price);
            Seller.setCash(Seller.getCash() + Price);
            System.out.println("After transaction: " + Buyer + ": " + Buyer.getCash());
            System.out.println("After transaction " + Seller + ": " + Seller.getCash());
            Buyer.setPhone(this);
            Seller.setPhone(null);
        } else System.out.println("I'm sorry, you can't do this");
    }
}
