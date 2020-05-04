package com.company;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();
        me.firstName = "Jacek";
        me.lastName = "Placek";
        me.pet = new Animal("mouse");
        me.pet.name = "Mysza";

        me.pet.feed();
        me.pet.feed();
        me.pet.feed();

        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();

        me.pet.feed();

        Car passat = new Car("Volkswagen", "Passat", 1984, 1.9, "Red", 14000.0);

        System.out.println("");

        me.getSalary();
        me.setSalary(10.0);
        me.getSalary();

        System.out.println("");

        me.setCar(passat);
        me.setSalary(6000.0);
        me.setCar(passat);
        me.setSalary(16000.0);
        me.setCar(passat);
    }
}
