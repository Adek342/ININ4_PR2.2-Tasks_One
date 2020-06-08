package com.company.devices;

import com.company.ApplicationPriceComparator;
import com.company.Human;

import javax.sound.midi.SysexMessage;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Phone extends Device{

    public Human Owner;
    public String Address = DEAFAULT_ADDRESS;
    public String Protocol = DEAFAULT_PROTOCOL;
    public String versionName = DEAFAULT_VERSION_NAME;
    public HashSet<Application> setApplication = new HashSet<Application>();


    public static final String DEAFAULT_ADDRESS = "www.apple.com";
    public static final String DEAFAULT_PROTOCOL = "https";
    public static final String DEAFAULT_VERSION_NAME = "PL";

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("Hello");
    }

    @Override
    public void sell(Human Buyer, Human Seller, Double Price) {
        if (Buyer.getCash() >= Price && Seller.getPhone() == this) {
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

    public void installAnnApp(Application application) throws Exception {
        if (Owner.getCash() >= application.priceApplication) {
            if (Owner == null)
                throw new Exception("The phone has no owner");
            setApplication.add(application);
            Owner.setCash(Owner.getCash() - application.priceApplication);
        } else System.out.println("Not enough gold :D ");
    }

    public void appIsInstalled(Application application) {
        if(setApplication.contains(application) == true)
            System.out.println("This app is installed");
        else if(setApplication.contains(application) == false) System.out.println("This app is not installed");

    }

    public void appIsInstalled(String applicationName) {
        Iterator<Application> it = setApplication.iterator();
        boolean isInstalled = false;
        while(it.hasNext())
        {
            if(it.next().nameApplication == applicationName)
                isInstalled = true;
        }
        if(isInstalled == true){
        System.out.println("This app is installed");}
        else  System.out.println("This app is not installed");
    }

    public void showFreeApps()
    {
        Iterator<Application> it = setApplication.iterator();
        while(it.hasNext())
        {
            if(it.next().priceApplication == 0.0){
                System.out.println(it.next().nameApplication);
            }
        }
    }

    public double sum_Of_APP_Values()
    {
        double value = 0;
        Iterator<Application> it = setApplication.iterator();
        while(it.hasNext())
        {
            value = value + it.next().priceApplication;
        }
        return value;
    }

    public void showAppsAlphabetically()
    {
        List<Application> sortList = new ArrayList<>(setApplication);
        Collections.sort(sortList);
        Iterator<Application> it = setApplication.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next().nameApplication + ",   ");
        }
    }
    public void showAppsByPrice()
    {
        List<Application> sortList = new ArrayList<>(setApplication);
        Collections.sort(sortList, new ApplicationPriceComparator());
        Iterator<Application> it = setApplication.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next().nameApplication + ",   ");
        }
    }
    //public void installAnnApp(String nameApplication){}
    //public void installAnnApp(String nameApplication, Double version){}
    //public void installAnnApp(String nameApplication, String address){}
    //public void installAnnApp(List<String> applicationList){}
    //public void installAnnApp(URL urlObject){
    //this.Protocol = urlObject.getProtocol();
    //this.Address = urlObject.getHost();
    //}
}


