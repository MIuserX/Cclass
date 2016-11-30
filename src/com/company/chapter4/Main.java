package com.company.chapter4;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello world");

        EmployeeTest et = new EmployeeTest();

        et.threeEmployees();

        StaticTest[] sts = new StaticTest[3];

        for (int i = 0; i < 3; ++i) {
            sts[i] = new StaticTest();
            sts[i].dispMyID();
        }
    }
}