package com.ar.interfaceEx;

public class CreditCardPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Credit card payment successfull");
    }
}
