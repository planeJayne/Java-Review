package com.hr.personnel;



public class Department {

    //fields
    private String name;
    private String location;
    private int currentIndex = 0;
    private Employee[] employees = new Employee[100];

    //constructor
    public Department(String name, String location) {
        this.name = name;
        this.location = location;
//        this.employees = new Employee[100];
//        this.currentIndex = 0;
    }

    public void addEmployee(Employee employee) {
        if (currentIndex < employees.length)
            employees[currentIndex] = employee;
            currentIndex++;
        }
    }

    public void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int count = 0;
        for (int i = 0; i < currentIndex; i++) {
//            employees[i].work();
        }
    }



