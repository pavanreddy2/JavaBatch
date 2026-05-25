package com.ar.markerInterface.cloneable.shallow;

public class ShallowCloningExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Account originalAccount = new Account(102222,"Param", "Saving", 900000);

        Employee originalEmployee = new Employee(101,"Param",900000,"Hyd",originalAccount);

        System.out.println("Original Employee Details");
        originalEmployee.getEmployee();

        System.out.println("Duplicate Employee Details");
        Employee duplicate = (Employee) originalEmployee.clone();
        System.out.println(duplicate);
        System.out.println(duplicate.account);
    }
}
