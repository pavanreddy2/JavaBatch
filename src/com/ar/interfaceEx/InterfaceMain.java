package com.ar.interfaceEx;

public class InterfaceMain {
    public static void main(String[] args) {

        Payment payment = new UPIPayment();
        payment.pay();
        //payment.scanner(); //compiler issue

        Payment credit = new CreditCardPayment();
        credit.pay();

        System.out.println(payment.i);

        System.out.println("*****************");

        Payment p;

        p = new UPIPayment();
        p.pay();

        p = new CreditCardPayment();
        p.pay();
        System.out.println(p.i);

        System.out.println();

        UPIPayment upi = new UPIPayment();
        upi.pay();
        upi.scanner();
    }
}
