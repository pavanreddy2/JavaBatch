package com.ar.constructor;


public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Param", "development", 90000.00);
        System.out.println(employee);

        System.out.println("Copy constructor");
        Employee employee1 = new Employee(employee);
        System.out.println(employee1);
    }
}
