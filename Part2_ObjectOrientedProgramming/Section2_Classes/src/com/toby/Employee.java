package com.toby;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    // Constructor
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }
    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

    // example of function overload, where we can change
    // the logic of a function based on input.
    public int calculateWage(){
        return baseSalary;
        // or, return calculateWage(0);
    }

    // setter
    public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary can not be 0 or less");
        this.baseSalary = baseSalary;
    }

    public void setHourlyRate(int hourlyRate){
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate can not be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    // getter
    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }
}
