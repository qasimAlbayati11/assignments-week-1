package com.atypon.training.assignment2;

/**
 * Created by Qasim albayati on 7/15/2018.
 */

public class Employee {

    private String firstName ;
    private String lastName ;
    private double monthlySalary;

    public Employee(){}

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = checkSalary(monthlySalary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = checkSalary(monthlySalary);
    }


    private double checkSalary(double salary){
        return (salary >= 0.0) ? salary : 0.0 ;
    }






}
