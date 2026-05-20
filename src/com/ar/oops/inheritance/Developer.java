package com.ar.oops.inheritance;

//Developer class inheritance Employee
public class Developer extends Employee {

    String programmingLanguage;

    void writeCode () {
        System.out.println(name + " is writing "+ programmingLanguage+ " code");
    }

}
