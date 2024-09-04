package com.hr.personnel;


public class SalariedEmployee extends Employee{

    //fields
    private double monthlySalary;


    //constructor
    public SalariedEmployee(String name, double monthlySalary){
        this.setName(name);
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


}