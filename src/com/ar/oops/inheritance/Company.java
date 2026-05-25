package com.ar.oops.inheritance;

public class Company {
    public static void main(String[] args) {

        //taking Parent class as reference and creating object for subclass.
        Employee manager = new Manager();
       int emp=  manager.employeeId = 100;
        String name = manager.name = "Param";
        System.out.println(emp);
        System.out.println(name);
        manager.login();

       // manager.department = ""

        System.out.println("*******************************");
        //Taking Sub class as reference class and creating object for SubClass (manager)
        Manager manager1 = new Manager();

       int e1 =  manager1.employeeId = 102;
       String e2 = manager1.name = "Pavan";

       String e3 = manager1.department = "Development Department";
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        manager1.login();
        manager1.approvalLeave();

        System.out.println("***************************");
        Developer developer = new Developer();
        int developerId = developer.employeeId = 103;
        String developerName = developer.name = "Anurundh";
        String developLanguage = developer.programmingLanguage = "Java";
        System.out.println(developerId);
        System.out.println(developerName);
        System.out.println(developLanguage);
        developer.login();
        developer.writeCode();
    }
}
