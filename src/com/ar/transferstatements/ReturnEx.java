package com.ar.transferstatements;

public class ReturnEx {
    //static method with return type and input parameter
    public static  int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
       int result = add(10,10);
        System.out.println(result);
    }
}
