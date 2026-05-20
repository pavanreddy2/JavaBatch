package com.ar.constructor;

public class Employee {
    int id;
    String empName;
    String department;
    double salary;
    //0 - arg constructor
    public Employee() {
    }

    //Parametized constructor
     public Employee(int id, String empName, String department, double salary) {
        this.id = id;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }

    //copy constructor
    public Employee(Employee employee) {
        this.id = employee.id;
        this.empName = employee.empName;
        this.department = employee.department;
        this.salary = employee.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
