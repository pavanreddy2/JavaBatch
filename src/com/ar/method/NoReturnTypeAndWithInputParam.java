package com.ar.method;

public class NoReturnTypeAndWithInputParam {
    public static void m1(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: "+ sum);
    }
    public static void main(String[] args) {
        m1(10,200);
    }
}
