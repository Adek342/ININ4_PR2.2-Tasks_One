package com.company;

import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();
        me.firstName = "Jacek";
        me.lastName = "Placek";
        me.pet = new Animal("mouse");
        me.pet.name = "Mysza";

        Human cousine = new Human();
        cousine.firstName = "Grzegorz";
        cousine.lastName = "Brzęczyszczykiewicz";
        cousine.setCash(1500.0);

        me.pet.feed();
        me.pet.feed();
        me.pet.feed();

        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();

        me.pet.feed();

        Car car1 = new Car("Volkswagen", "Passat", 1984, 1.9, "Red", 14000.0);

        System.out.println("");

        me.getSalary();
        me.setSalary(10.0);
        me.getSalary();
        me.setSalary(20.0);
        me.getSalary();

        System.out.println("");

        me.setCar(car1);
        me.setSalary(6000.0);
        me.setCar(car1);
        me.setSalary(16000.0);
        me.setCar(car1);

        System.out.println("");
        Car car2 = new Car("Volkswagen", "Passat", 1984, 1.9, "Red", 14000.0);

        System.out.println(car1.equals(car2));
        System.out.println("");

        System.out.println(me.getCar());
        System.out.println(me);
        System.out.println(me.pet);

        me.getCar().turnOn();

        System.out.println("");

        me.getCar().sell(cousine, me, 1000.0);
    }
}
