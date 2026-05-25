package com.ar.oops.encapsulation;

public class EmployeeEx {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(101);
        employee.setName("Param");
        employee.setSalary(10000d);

        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());

    }
}
