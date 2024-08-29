package com.hr.personnel;


import java.time.LocalDate;

public class Employee {
    String name;
    LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;


    }

    //method to get employee info
    public String getEmployeeInfo(){
        return "Name: " + name + " Hire Date: " + hireDate;
    }

    //method for work
    public String work(){
        return "Name: " + name + "worked.";

    }

    //additional method to compute years worked
    public int computeNumberOfYearsWorkedSinceHired(){
        Integer currentYear = 2022;
        Integer yearsWorked = currentYear - hireDate.getYear();

        return  yearsWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}