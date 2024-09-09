package com.hr.personnel;


import java.time.LocalDate;

public class SalariedEmployee extends Employee{

    //fields
    private double monthlySalary;


    //constructor
    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary){
        super(name, hireDate);
        this.monthlySalary(monthlySalary);
    }

    private void monthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }


    //getters and setters
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String work(){
        return getName() + " worked.";
    }

    @Override
    public double computeMonthlySalary(){
        return monthlySalary;
    }


}