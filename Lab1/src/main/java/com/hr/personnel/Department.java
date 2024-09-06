package com.hr.personnel;

import java.time.LocalDate;

public class Department {

    // Fields
    private String name;
    private String location;
    private int currentIndex = 0;
    private Employee[] employees = new Employee[100];

    // Constructor
    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Method to add an employee
    public void addEmployee(Employee employee) {
        if (currentIndex < employees.length) {
            employees[currentIndex] = employee;
            currentIndex++;
        }
    }

    // Method to let employees work and return the number of employees who worked
    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int count = 0;
        for (int i = 0; i < currentIndex; i++) {
            String peopleWorked = employees[i].work();
            if (peopleWorked.contains("worked")) {
                count++;
            }
        }
        return count;
    }
}
