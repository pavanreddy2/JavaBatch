package com.ar.oops.inheritance.multilevel;

public class Main {
    public static void main(String[] args) {
        HOD h = new HOD();

        h.setName("Pavan");
        h.setAge(20);
        h.subject = "Java";

       // h.displayPersonDetails();
        h.teach();
        h.manageDepartment();

    }
}
