package com.company;

public class Human {
    public Animal pet;
    public String firstName;
    public String lastName;
    private Car car;
    private Double salary = 0.0;
    private Double lastTimeSalary = 0.0;

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

    public Car getCar() {
        System.out.print(this.firstName + " " + this.lastName + ": ");
        return car;
    }

    public void setCar(Car car) {
        if (this.salary > car.value) {
            System.out.println("You bought a car for cash");
            this.car = car;
        } else if (this.salary >= car.value / 12) {
            System.out.println("You bought a car with a loan");
            this.car = car;
        } else {
            System.out.println("I'm sorry you can't buy this car");
        }
    }
}
