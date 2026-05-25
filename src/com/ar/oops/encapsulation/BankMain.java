package com.ar.oops.encapsulation;

public class BankMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposite(5000);
        System.out.println("your balance amount: " + bankAccount.checkBalance());

        bankAccount.withdraw(12000);
        System.out.println("your balance amount: " + bankAccount.checkBalance());
    }
}
