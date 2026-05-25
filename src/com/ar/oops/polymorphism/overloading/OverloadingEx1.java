package com.ar.oops.polymorphism.overloading;

public class OverloadingEx1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

       int result =  calculator.add(10, 20);
       double result1 = calculator.add(10.00, 2000.00);

        System.out.println(result);
        System.out.println(result1);
    }
}
