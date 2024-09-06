package com.hr.personnel;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class DepartmentTest {

    @Test
    public void testAddAndCountEmployees() {
        // Set up the test
        Department department = new Department("IT", "Atlanta");

        // Create employee instances
        Employee emp1 = new SalariedEmployee("Nathan", LocalDate.of(2010, 12, 25), 3500);
        Employee emp2 = new HourlyEmployee("Maya", LocalDate.of(1999, 9, 27), 160, 33);

        // Add employees to the department
        department.addEmployee(emp1);
        department.addEmployee(emp2);

        // Let employees work and count the number who worked
        int count = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();

        // Assert that the count is as expected
        Assert.assertEquals(2, count);
    }
}
