package com.ar.oops.polymorphism.overriding;

public class UPIPayment extends Payment{

    @Override
    void processPayment() {
        System.out.println("processing UPI payment");
    }
}
