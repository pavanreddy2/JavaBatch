package com.ar.oops.polymorphism.overriding;

public class CreditCardPayment extends Payment{

    @Override
    void processPayment() {
        System.out.println("processing credit card payment");
    }
}
