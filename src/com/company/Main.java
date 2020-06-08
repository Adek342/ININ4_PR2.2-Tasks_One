package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Application;
import com.company.devices.Car;
import com.company.devices.Diesel;
import com.company.devices.Phone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        Human me = new Human("Jacek", "Placek");
        me.pet = new Pet("mouse");
        me.pet.name = "Mysza";
        me.setSalary(16000.0);
        me.setCash(20000.0);

        Human cousine = new Human("Grzegorz", "Brzęczyszczykiewicz");
        cousine.setCash(1500.0);

        System.out.println("");

        Car car1 = new Diesel("Volkswagen", "Passat", 1984, 1.9, "Red", 14000.0);
        Car car2 = new Diesel("Audi", "A4", 2000, 2.0, "Blue", 16000.0);
        me.setCar(0, car1);

        System.out.println("");
        cousine.showCars();
        System.out.println("");
        me.showCars();
        System.out.println("");

        me.getCar(0).sell(cousine, me, 100.0);
        cousine.getCar(0).sell(me, cousine, 100.0);

        System.out.println("");
        cousine.showCars();
        System.out.println("");
        me.showCars();
        System.out.println("");

        car1.showOwnerList();
        car2.showOwnerList();
        System.out.println(" ");

        car1.transactionHistory();
        car2.transactionHistory();

        car1.getNumberOfSales();
        car2.getNumberOfSales();

        System.out.println(" ");

        Phone Iphone = new Phone("Apple", "10", 2019);
        me.setPhone(Iphone);
        System.out.println(me.getCash());

        Application FlappyBird = new Application("FlappyBird", 1.1,12.0);
        Application COD = new Application("COD", 1.2,1000.0);
        Application HeroZero = new Application("HeroZero", 1.2,0.0);

        System.out.println("");

        me.getPhone().installAnnApp(FlappyBird);
        me.getPhone().installAnnApp(COD);
        me.getPhone().installAnnApp(HeroZero);

        System.out.println("");

        me.getPhone().appIsInstalled(FlappyBird);
        me.getPhone().appIsInstalled(COD);

        System.out.println("");

        //me.getPhone().showFreeApps();
        //System.out.println(me.getPhone().sum_Of_APP_Values());
        me.getPhone().showAppsAlphabetically();
        System.out.println("");
        me.getPhone().showAppsByPrice();


    }
}
