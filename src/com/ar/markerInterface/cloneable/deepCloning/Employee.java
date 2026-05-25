package com.ar.markerInterface.cloneable.deepCloning;



public class Employee implements Cloneable{
    int eid;
    String ename;
    double esal;
    String address;

    //Contained
    Account account;


    public Employee(int eid, String ename, double esal, String address, Account account) {
        this.eid = eid;
        this.ename = ename;
        this.esal = esal;
        this.address = address;
        this.account = account;
    }

    public void getEmployee() {
        System.out.println("Employee Details..");
        System.out.println("-------------------");
        System.out.println("Emp Id :"+ eid);
        System.out.println("Emp Name :"+ ename);
        System.out.println("Emp Salary :"+ esal);
        System.out.println("Emp Adress :"+ address);

        System.out.println();
        System.out.println("-----------");
        System.out.println("Account Details");
        System.out.println("Account No: "+ account.accNo);
        System.out.println("Account HolderName: "+ account.accHolderName);
        System.out.println("Account Type: "+ account.accType);
        System.out.println("Account Balance: "+ account.balance);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Account duplicateAccount = new Account(account.accNo, account.accHolderName, account.accType, account.balance);

        Employee duplicateEmployee = new Employee(eid, ename, esal, address, duplicateAccount);

        return duplicateEmployee;
    }
}
