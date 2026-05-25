package com.ar.abstractclass;

public class SavingAccount extends Account{

    @Override
    void calculateInterest() {
        System.out.println("Saving interest = 6%");
    }
}
