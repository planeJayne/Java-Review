package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

public class HRClient {

    public static void main(String[] args) {
        Department dept = new Department("IT", "Atlanta");

        SalariedEmployee semp1 = new SalariedEmployee("Nathan",LocalDate.of(2010,12,25), 3500);
        SalariedEmployee semp2 = new SalariedEmployee("Ashley", LocalDate.of(2014, 11, 8),7500);

        HourlyEmployee hemp1 = new HourlyEmployee("Maya", LocalDate.of(1999,9,27),160, 33);

        dept.addEmployee(semp1);
        dept.addEmployee(semp2);
        dept.addEmployee(hemp1);


    }
}

