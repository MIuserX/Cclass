package com.company.chapter4;

/**
 * Created by Readdy on 2016/11/28.
 * @version 0.0.1 2016/11/28
 * @author weidi.jin
 */
public class EmployeeTest {

    public static void main(String[] args) {
        EmployeeTest et = new EmployeeTest();

        et.threeEmployees();
    }

    public void threeEmployees() {
        Employee[] staff = new Employee[3];

        Integer[] ints = new Integer[10];

        staff[0] = new Employee("Readdy Jin", 11000, 1988, 12, 3);
        staff[1] = new Employee("Keane Liu", 15000, 1978, 1, 23);
        staff[2] = new Employee("Ackar Shi", 11000, 2012, 7, 8);

        for (Employee e : staff) {
            String s = e.getName();

            System.out.println(s);
        }
    }
}
