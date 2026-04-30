package com.ar.accessModifiers;

class Account {
    private double balance = 1000;

    public void showBalance() {
        System.out.println(balance);
    }
}
public class PrivateExample {
    public static void main(String[] args) {
        Account account = new Account();
        account.showBalance();
        //System.out.println(account.balance);
    }
}
