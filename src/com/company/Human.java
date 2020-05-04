package com.company;

public class Human {
    public Animal pet;
    public String firstName;
    public String lastName;
    public Car car;
    private Double salary = 0.0;
    private Double lastTimeSalary = 0.0;

    public Double getSalary() {
        System.out.println("You earned " + lastTimeSalary + " in the past");
        System.out.println("Now you earn " + salary);
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary >= 0){
            this.lastTimeSalary = this.salary;
            this.salary = salary;
        }
        else System.out.println("It's impossible");
    }
}
