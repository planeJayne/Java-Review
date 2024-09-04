package com.hr.personnel;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class EmployeeTest {
    @Before
    public void setUp() {
        Department dept = new Department("Justin", "Texas");
        SalariedEmployee salariedEmployee = new SalariedEmployee("Nathan", 3500);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jason", 160, 13);
    }

    @Test
    public void testAddEmployee() {

    }
}
