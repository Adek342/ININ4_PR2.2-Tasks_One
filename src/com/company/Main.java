package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Diesel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        Human me = new Human("Jacek", "Placek");
        me.pet = new Pet("mouse");
        me.pet.name = "Mysza";

        Human cousine = new Human("Grzegorz", "Brzęczyszczykiewicz");
        cousine.setCash(1500.0);

        me.pet.feed();
        me.pet.feed();
        me.pet.feed();

        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();

        me.pet.feed();

        Car car1 = new Diesel("Volkswagen", "Passat", 1984, 1.9, "Red", 14000.0);

        System.out.println("");

        me.getSalary();
        me.setSalary(10.0);
        me.getSalary();
        me.setSalary(20.0);
        me.getSalary();

        System.out.println("");

        me.setCar(0, car1);
        me.setSalary(6000.0);
        me.setCar(0, car1);
        me.setSalary(16000.0);
        me.setCar(0, car1);

        System.out.println("");
        Car car2 = new Diesel("Volkswagen", "Passat", 2000, 1.9, "Red", 14000.0);
        Car car3 = new Diesel("Volkswagen", "Passat", 1999, 1.9, "Red", 14000.0);
        Car car4 = new Diesel("Volkswagen", "Passat", 1962, 1.9, "Red", 14000.0);
        Car car5 = new Diesel("Volkswagen", "Passat", 1962, 1.9, "Red", 14000.0);
        me.setCar(2, car2);
        me.setCar(3, car3);

        System.out.println(car1.equals(car2));
        System.out.println("");

        System.out.println(me.getCar(0));
        System.out.println(me);
        System.out.println(me.pet);

        me.getCar(0).turnOn();

        System.out.println("");

        // System.out.println(me.getCar(0));
        //System.out.println(cousine.getCar(0));

        //me.getCar(0).sell(cousine, me, 1000.0);

        //System.out.println(me.getCar(0));
        //System.out.println(cousine.getCar(0));

        System.out.println(me.sum_Of_Vehicle_Values());

        me.setCash(20000.0);
        cousine.setCar(0, car5);

        System.out.println("");
        me.showCars();
        System.out.println("");
        cousine.showCars();

        //cousine.getCar(0).sell(me, cousine, 100.0);

        System.out.println("");

        me.showCars();
        cousine.showCars();
    }
}
