package com.atypon.training.assignment2;

/**
 * Created by Qasim albayati on 7/15/2018.
 */

public class TestEmployee {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setFirstName("Ahmad");
        employee1.setLastName("Ali");
        employee1.setMonthlySalary(-555.0);

        employee1.setMonthlySalary(employee1.getMonthlySalary()+employee1.getMonthlySalary()*0.10);

        System.out.println("the salary of "+employee1.getFirstName()
                          +" is: "+employee1.getMonthlySalary());

        Employee employee2 = new Employee("Mahmoud","Omar",350.0) ;

        employee2.setMonthlySalary(employee2.getMonthlySalary()+employee2.getMonthlySalary()*0.10);

        System.out.println("the salary of "+employee2.getFirstName()
                          +" is: "+employee2.getMonthlySalary());

    }

}
