package com.hr.personnel;

public class HourlyEmployee extends Employee{

    //fields
    private int hoursWorkedPerMonth;
    private double hourlyRate;

    public HourlyEmployee(String name, int hoursWorkedPerMonth, double hourlyRate) {
        super(name);
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;

    }


    //getters and setters
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    @Override
    public String work(){
        return getName() + " worked.";
    }
}