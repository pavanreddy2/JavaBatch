package com.ar.oops.inheritance;

//Manager class inherits Employee
public class Manager extends Employee{

    String department;

    void approvalLeave() {
        System.out.println(name + " approved leave");
    }
}
