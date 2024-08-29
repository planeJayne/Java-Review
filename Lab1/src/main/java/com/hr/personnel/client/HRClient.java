package com.hr.personnel.client;

import com.hr.personnel.Employee;

import java.time.LocalDate;

class HRClient {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Mike", LocalDate.of(2010,12,28));
        String emp1Info = emp1.getEmployeeInfo();
        System.out.println(emp1Info);
        System.out.println(emp1.getName() + " has been employed for " + emp1.computeNumberOfYearsWorkedSinceHired() + " years.");

        Employee emp2 = new Employee("John",LocalDate.of(2018,9,27));
        String emp2Info = emp2.getEmployeeInfo();
        System.out.println(emp2Info);

    }



}