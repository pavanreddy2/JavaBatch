package com.ar.oops.polymorphism.overriding;

public class PaymentMainEx {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment();

        Payment upiPayment = new UPIPayment();
        upiPayment.processPayment();
    }
}
