package com.ar.interfaceEx;

public class UPIPayment implements Payment{


    @Override
    public void pay() {
        System.out.println("UPI Payment Successfully");
    }

    public void scanner() {
        System.out.println("Payment done by scan...");
    }
}
