package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human {
    public Animal pet;
    public String firstName;
    public String lastName;
    private Car car;
    private Phone phone;
    private Double salary = 0.0;
    private Double lastTimeSalary = 0.0;
    private Double cash = 0.0;

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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        //if (this.salary > car.value) {
            //System.out.println("You bought a car for cash");
            this.car = car;
        //} else if (this.salary >= car.value / 12) {
            //System.out.println("You bought a car with a loan");
            //this.car = car;
        //} else {
          //  System.out.println("I'm sorry you can't buy this car");
        //}
    }

    public Phone getPhone() { return phone; }

    public void setPhone(Phone phone) { this.phone = phone; }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
