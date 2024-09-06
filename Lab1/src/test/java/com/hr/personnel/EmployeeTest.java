package com.hr.personnel;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class EmployeeTest {

    private Department department;
    private SalariedEmployee salariedEmployee;
    private HourlyEmployee hourlyEmployee;

    @Before
    public void setUp() {
        // Initialize the department and employees
        department = new Department("Justin", "Texas");
        salariedEmployee = new SalariedEmployee("Nathan", LocalDate.of(2010, 12, 25), 3500);
        hourlyEmployee = new HourlyEmployee("Jason", LocalDate.of(2010, 10, 26), 27, 20);
    }

    @Test
    public void testAddEmployee() {
        // Add employees to the department
        department.addEmployee(salariedEmployee);
        department.addEmployee(hourlyEmployee);

        // Let employees work and count the number who worked
        int count = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();

        // Assert that the number of employees who worked is correct
        assertEquals(2, count);  // Assuming both employees worked
    }
}
