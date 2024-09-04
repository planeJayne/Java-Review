package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

public class HRClient {

    public static void main(String[] args) {
        Department dept = new Department("IT", "Atlanta");

        SalariedEmployee semp1 = new SalariedEmployee("Justin", 6100);
        SalariedEmployee semp2 = new SalariedEmployee("Ashley", 4300);

        HourlyEmployee hemp1 = new HourlyEmployee("Nathan", 160,33.50);

        dept.addEmployee(semp1);
        dept.addEmployee(semp2);
        dept.addEmployee(hemp1);


    }
}

