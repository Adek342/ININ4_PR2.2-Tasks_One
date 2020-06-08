package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Phone;

import java.lang.reflect.Array;
import java.util.*;

import java.util.Comparator;

public class Human implements Comparator<Car>{
    public Animal pet;
    public String firstName;
    public String lastName;
    public Car[] garage;
    private Phone phone;
    private Double salary = 0.0;
    private Double lastTimeSalary = 0.0;
    private Double cash = 0.0;

    public static final Integer DEFAULT_NUMBER_OF_VEHICLES = 4;

    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        garage = new Car[DEFAULT_NUMBER_OF_VEHICLES];
    }

    public Double getSalary() {
        System.out.println("You earned " + lastTimeSalary + " in the past");
        System.out.println("Now you earn " + salary);
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary >= 0) {
            this.lastTimeSalary = this.salary;
            this.salary = salary;
        } else System.out.println("It's impossible");
    }

    public Double getCash() { return cash; }

    public void setCash(Double cash) { this.cash = cash; }

    public Car getCar(Integer parkingSpaceNumber){
        if(garage[parkingSpaceNumber] != null) {
            garage[parkingSpaceNumber].sellerParking = parkingSpaceNumber;
        }
        //garage[parkingSpaceNumber].sellerParking = parkingSpaceNumber;
            return garage[parkingSpaceNumber];
    }

    public void setCar(Integer parkingSpaceNumber, Car car) throws Exception {
       // for (int i = 0; i < garage.length; i ++) {
            if (car != null) {
                car.numberOfOwners++;
                car.listOfOwners.add(this);
            }
                garage[parkingSpaceNumber] = car;

            //if(i == garage.length-1 && garage[i] != null)
             //   throw new Exception("This garage is full");
       // }

    }

    public Phone getPhone() { return phone; }

    public void setPhone(Phone phone) { this.phone = phone;
    this.phone.Owner = this;
    }

    public double sum_Of_Vehicle_Values()
    {
        double value = 0;
        for (int i = 0; i < garage.length; i ++) {
            if (garage[i] != null){
                value = garage[i].value + value;
            }
        }
        return value;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " ";
    }

    @Override
    public int compare(Car o1, Car o2) {
        {
            if(o2 == null) return -1;
            if (o1==null) return -1;
            if(o1.yearOfProduction > o2.yearOfProduction) return 1;
            else if(o1.yearOfProduction < o2.yearOfProduction) return -1;
            else return 0;
        }
    }

    public void sortCar()
    {
        Arrays.sort(garage, this);
    }
    public void showCars(){
        System.out.println(firstName + " " + lastName+": ");
        for(Car c: garage)
            System.out.println(c);
    }
}
