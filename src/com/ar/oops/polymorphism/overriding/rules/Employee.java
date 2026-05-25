package com.ar.oops.polymorphism.overriding.rules;

public class Employee extends User{

    @Override
    Employee getProfile() {
        return new Employee();
    }
}
