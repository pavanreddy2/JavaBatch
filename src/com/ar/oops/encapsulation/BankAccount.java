package com.ar.oops.encapsulation;

public class BankAccount {

    //private Data hiding
    private  double balance;    // Data hiding

    //public method to deposity money
    public void deposite (double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(amount + " deposited");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawm");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    //to check balance
    public double checkBalance () {
        return balance;
    }
}
