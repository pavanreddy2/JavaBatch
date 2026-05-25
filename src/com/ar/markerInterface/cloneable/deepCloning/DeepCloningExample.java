package com.ar.markerInterface.cloneable.deepCloning;



public class DeepCloningExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Account originalAccount = new Account(102222,"Param", "Saving", 900000);

        Employee originalEmployee = new Employee(101,"Param",900000,"Hyd",originalAccount);

        System.out.println("Original Employee Details");
        originalEmployee.getEmployee();

        System.out.println();
        System.out.println("Duplicate Object");
        Employee duplicateEmployee = (Employee) originalEmployee.clone();
        duplicateEmployee.getEmployee();
    }
}
