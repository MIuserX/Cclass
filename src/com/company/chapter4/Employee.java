package com.company.chapter4;

import java.time.LocalDate;

/**
 * Created by Readdy on 2016/11/29.
 */
public class Employee {

    private static int nextID = 0;

    private String name = "DefaultName";
    private double salary = 11000;
    private LocalDate hireDay;

    public Employee() {
        hireDay = LocalDate.now();
    }

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setName(String n) {
        name = n;
    }

    public void setSalary(double s) {
        salary = s;
    }
}
