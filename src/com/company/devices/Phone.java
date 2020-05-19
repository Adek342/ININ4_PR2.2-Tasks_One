package com.company.devices;

import com.company.Human;
import java.util.ArrayList;
import java.util.List;
import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device {

    public String Address = DEAFAULT_ADDRESS;
    public String Protocol = DEAFAULT_PROTOCOL;
    public String versionName = DEAFAULT_VERSION_NAME;

    public static final String DEAFAULT_ADDRESS = "www.apple.com";
    public static final String DEAFAULT_PROTOCOL = "https";
    public static final String DEAFAULT_VERSION_NAME = "PL";

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

    public void installAnnApp(String applicationName){}
    public void installAnnApp(String applicationName, Double version){}
    public void installAnnApp(String applicationName, String address){}
    public void installAnnApp(List<String> applicationList){}
    public void installAnnApp(URL urlObject){
        this.Protocol = urlObject.getProtocol();
        this.Address = urlObject.getHost();
    }
}
