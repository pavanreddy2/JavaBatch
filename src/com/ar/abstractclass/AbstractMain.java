package com.ar.abstractclass;

public class AbstractMain {
    public static void main(String[] args) {
        Account account = new SavingAccount();
        account.login();
        account.calculateInterest();
    }
}
